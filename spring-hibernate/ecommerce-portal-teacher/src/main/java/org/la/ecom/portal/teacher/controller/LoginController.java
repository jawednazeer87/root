package org.la.ecom.portal.teacher.controller;

import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.la.ecom.mysql.api.dto.AuthenticationRequestDTO;
import org.la.ecom.mysql.api.dto.AuthenticationResponseDTO;
import org.la.ecom.mysql.api.dto.RoleDTO;
import org.la.ecom.mysql.api.dto.UserDTO;
import org.la.ecom.portal.teacher.client.service.ApiServicePortalTeacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private ApiServicePortalTeacher apiService;
	
	private final Logger log = LoggerFactory.getLogger(LoginController.class);
			
	@GetMapping("/login")
	public ModelAndView loginTest(@ModelAttribute AuthenticationRequestDTO authRequest) {

		ModelAndView mav = new ModelAndView("login");
		mav.addObject(authRequest);
		return mav;
	}
	
	@GetMapping("/registration")
	public ModelAndView registrationTest(HttpServletRequest req, HttpServletResponse res, 
			@ModelAttribute UserDTO userDto) {

		ModelAndView mav = new ModelAndView("registration");
		mav.addObject(userDto);
		return mav;
	}
	
	@PostMapping("/login")
	public ModelAndView login(HttpServletRequest req, @ModelAttribute AuthenticationRequestDTO authRequest) {

		log.info("username: " + authRequest.getUsername());
		ModelAndView mav = new ModelAndView("login");
		AuthenticationResponseDTO authenticationResponseDTO = null;
		try {
			authenticationResponseDTO = 
				apiService.securityClient().postForObject("/authenticate", authRequest, AuthenticationResponseDTO.class);
			
			String jwt = authenticationResponseDTO.getJwt();
			req.getSession().setAttribute("jwt", jwt);
			
			mav.setViewName("welcome");
			mav.addObject("authRequest", authRequest);
			return mav;
			
		} catch (RestClientException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	@GetMapping("/welcome")
	public ModelAndView welcome(@ModelAttribute AuthenticationRequestDTO authRequest) {
		
		log.info("welcome");
		ModelAndView mav = new ModelAndView("welcome");

		return mav;
	}
	
	@GetMapping("/test")
	public ModelAndView test(@ModelAttribute AuthenticationRequestDTO authRequest) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication!=null) {
			boolean authenticated = authentication.isAuthenticated();
			if(authenticated) {
				log.info(""+authentication.getClass());
				if(!(authentication instanceof AnonymousAuthenticationToken) ) {
					return new ModelAndView("redirect:/welcome", "authRequest", authRequest);
				}
			}
			log.info(authenticated+"");
		}
		
		log.info("test--------------------------: ");
		ModelAndView mav = new ModelAndView("registration");

		return mav;
	}
	
	@GetMapping("/test2")
	public ModelAndView test2(@ModelAttribute AuthenticationRequestDTO authRequest) {
		
		log.info("test--------------------------: ");
		ModelAndView mav = new ModelAndView("registration");

		return mav;
	}

	@PostMapping("/registration")
	public ModelAndView registration(@ModelAttribute UserDTO user) {

		log.info("email: " + user.getEmail());

		String dobString = user.getDobString();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = null;
		
		try {
			parse = df.parse(dobString);
			
			String roleName = user.getRoleName();
			RoleDTO role = new RoleDTO();
			role.setRole(roleName);
			user.setRoles(new HashSet<>(Arrays.asList(role)));
			user.setDob(parse);
			user.setStatus(1);
			user.setActive(true);
			
			user = apiService.securityClient().postForObject("/registration", user, UserDTO.class);
			
		} catch (ParseException e) {
			log.error(e.getMessage());
		}
		catch (Exception e) {
			log.error(e.getMessage());
		}
		
		ModelAndView mav = new ModelAndView("login");

		return mav;
	}

	@RequestMapping("/hello")
	public ModelAndView hello() {
		
		log.info("secure page");

		ModelAndView mav = new ModelAndView("success");

		return mav;
	}
}
