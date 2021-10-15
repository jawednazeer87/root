package org.la.att.system.rest.controller;

import java.util.Base64;
import java.util.Date;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.la.att.system.exception.AlreadyExistsException;
import org.la.att.system.exception.InvalidTokenException;
import org.la.att.system.model.BlackListToken;
import org.la.att.system.model.User;
import org.la.att.system.service.BlackListTokenService;
import org.la.att.system.service.CustomUserDetailsService;
import org.la.att.system.service.UserService;
import org.la.att.system.util.CipherUtil;
import org.la.att.system.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	private final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private CustomUserDetailsService userDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserService userService;
	
	@Value("${encryption.salt.value}")
	private String salt;
	
	@Value("${encryption.password}")
	private String password;
	
	@Value("${encryption.iv.parameter.spec}")
	private String ivParameterSpecValue;

	@Value("${encryption.algorithm}")
	private String algorithm;
	
	@Autowired
	private JwtUtil jwtTokenUtil;
	
	@Autowired
    private BlackListTokenService blackListTokenService;
	
	//Cannot access without valid jwt
	@GetMapping(value = "/user/get/all")
	public ResponseEntity<Object> get(){
		return new ResponseEntity<Object>("This is secure page", HttpStatus.OK);
	}
	
	//register user
	@PostMapping(value = "/registration")
	public ResponseEntity<Object> registerPost(@RequestBody User user, HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		User user2 = userDetailsService.findByEmail(user.getEmail());
		
		if(user2!=null) {
			throw new AlreadyExistsException("User with email "+user.getEmail()+" already exists");
		}
		
		user2 = userDetailsService.saveUser(user, "ROLE_USER");
		return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
	}

	//update password
	@PutMapping(value = "/update/password")
	public ResponseEntity<Object> updatePassword(@RequestBody String pwd, 
									@RequestParam(required = true) String cipherText,
									HttpServletRequest request, HttpServletResponse res) throws Exception {
		
		/*
		 * Decrypt jwt
		 */
		SecretKey key = CipherUtil.getKeyFromPassword(password, salt);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(ivParameterSpecValue.getBytes());
        byte[] decodedBytes = Base64.getDecoder().decode(cipherText);
        String decodedString = new String(decodedBytes);
        String jwt = CipherUtil.decrypt(algorithm, decodedString, key, ivParameterSpec);

		//checking whether token already used for password update
		//making jwt one time use 
		if(blackListTokenService.isTokenBlackListed(jwt)) {
			throw new InvalidTokenException("Invalid token");
		}
			
		String username = jwtUtil.extractUsername(jwt);
		
		if(username!=null && username.length()>0) {
			UserDetails userDetails = userDetailsService.loadUserByUsername(username);
			if(jwtTokenUtil.validateToken(jwt, userDetails)) {
				log.info("valid token");
				User user2 = userService.findByEmail(username);
				user2.setPassword(bCryptPasswordEncoder.encode(pwd));
				user2 = userService.update(user2);
				if(user2!=null) {
					//after password update making token black listed
					BlackListToken blackListToken = new BlackListToken(new Date(), jwt);
					blackListTokenService.save(blackListToken);
					return new ResponseEntity<>(HttpStatus.OK);
				}
			}
			else {
				log.info("Invalid jwt token");
			}
		}
		throw new InvalidTokenException("Invalid token");
	}
	
}