package org.la.att.system.rest.controller;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.la.att.system.dto.Mail;
import org.la.att.system.exception.UserNotFoundException;
import org.la.att.system.model.BlackListToken;
import org.la.att.system.request.model.AuthenticationRequest;
import org.la.att.system.response.model.AuthenticationResponse;
import org.la.att.system.service.BlackListTokenService;
import org.la.att.system.service.CustomUserDetailsService;
import org.la.att.system.service.EmailService;
import org.la.att.system.util.CipherUtil;
import org.la.att.system.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

	private final Logger log = LoggerFactory.getLogger(TokenController.class);
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Value("${password.reset.expiry.time}")
	private String passwordResetExpiryTime;
	
	@Value("${session.expiry.time}")
	private String sessionExpiryTime;
	
	@Value("${encryption.salt.value}")
	private String salt;
	
	@Value("${encryption.password}")
	private String password;
	
	@Value("${encryption.iv.parameter.spec}")
	private String ivParameterSpecValue;
	
	@Value("${encryption.algorithm}")
	private String algorithm;
	
	@Value("${mail.from}")
	private String from;
	
	@Autowired
	private CustomUserDetailsService userDetailsService;
	
	@Autowired
	private JwtUtil jwtTokenUtil;
	
	@Autowired
    private EmailService emailService;
	
	@Autowired
    private BlackListTokenService blackListTokenService;
	
	//generate token for valid credentials
	@PostMapping(value = "/authenticate")
	public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody AuthenticationRequest req,
			HttpServletRequest request) {
		
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword()));
		}
		catch (BadCredentialsException e) {
			throw new BadCredentialsException("Incorrect username or password", e);
		}
		
		UserDetails userDetails = userDetailsService.loadUserByUsername(req.getUsername());
		final String jwt = jwtTokenUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt, sessionExpiryTime));
		
	}
	
	@GetMapping(value = "/token/invalidate")
	public ResponseEntity<Object> logout(HttpServletRequest request, HttpServletResponse res) throws Exception {
		
		final String authorizationHeader = request.getHeader("Authorization");
		String token = null;
		if(authorizationHeader!=null && authorizationHeader.startsWith("Bearer ")) {
			token = authorizationHeader.substring(7);
		}
		BlackListToken blackListToken = new BlackListToken(new Date(), token); 
		blackListTokenService.save(blackListToken);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/reset/password/url")
	public ResponseEntity<Object> createPasswordURL(@RequestBody AuthenticationRequest user, HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());
		
		if(userDetails==null) {
			throw new UserNotFoundException(user.getUsername()+" User not found");
		}
		
		//setting jwt expire time for reset password which is shorter than usual jwt expire time
		jwtTokenUtil.setExpiryTime(passwordResetExpiryTime);
		final String jwt = jwtTokenUtil.generateToken(userDetails);
		
		//send mail
		sendMail(user.getUsername(), jwt, req);

        return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//send encrypted password in mail
	private void sendMail(String username, String jwt, HttpServletRequest req) 
			throws NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException,
					BadPaddingException, InvalidAlgorithmParameterException, NoSuchPaddingException, InvalidKeySpecException {
		
		Mail mail = new Mail();
		mail.setTo(username);
		mail.setFrom(from);
		mail.setSubject("Reset Password");
		
		/*
		 * Encrypt jwt
		 * encode in base64url
		 */
        SecretKey key = CipherUtil.getKeyFromPassword(password, salt);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(ivParameterSpecValue.getBytes());
        String cipherText = CipherUtil.encrypt(algorithm, jwt, key, ivParameterSpec);
        String encodedString = Base64.getEncoder().encodeToString(cipherText.getBytes());
        StringBuilder bodyContent = new StringBuilder("<div>");
        bodyContent.append("<p><a href=http://localhost:4200/resetPassword?cipherText="+encodedString+">Reset Password</a></p>");
        int mins = Integer.valueOf(passwordResetExpiryTime)/60000;
        bodyContent.append("<p>Link will expire in <b>"+mins+"</b> minutes</p></div>");
		mail.setBodyContent(bodyContent.toString());

		//mail send from thread
		ExecutorService emailExecutor = Executors.newSingleThreadExecutor();
		emailExecutor.execute(() -> {
			try {
            	emailService.sendMail(mail);
            	log.info("mail send successfully");
            } catch (Exception e) {
                log.error("failed", e);
            }
		});
        emailExecutor.shutdown();
	}
	
}
