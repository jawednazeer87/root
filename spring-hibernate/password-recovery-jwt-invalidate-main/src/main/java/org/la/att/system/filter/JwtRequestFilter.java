package org.la.att.system.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.la.att.system.model.BlackListToken;
import org.la.att.system.service.BlackListTokenService;
import org.la.att.system.service.CustomUserDetailsService;
import org.la.att.system.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtRequestFilter extends OncePerRequestFilter{

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CustomUserDetailsService userDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
    private BlackListTokenService blackListTokenService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
	
		final String authorizationHeader = request.getHeader("Authorization");
		
		String username = null;
		String jwt = null;
		
		if(authorizationHeader!=null && authorizationHeader.startsWith("Bearer ")) {
			
			jwt = authorizationHeader.substring(7);
			
			if(jwt!=null && jwt.length()>0) {
				
				//checking logout user
				List<BlackListToken> blackListToken = blackListTokenService.findByToken(jwt);
				if(blackListToken!=null && !blackListToken.isEmpty()) {
					//if jwt black listed then intentionally checking wrong token
					jwtUtil.extractUsername("invalidtoken");
				}
				
				username = jwtUtil.extractUsername(jwt);
				
				if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
					
					UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
					
					if(jwtUtil.validateToken(jwt, userDetails)) {
						
						UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
								userDetails, null, userDetails.getAuthorities());
						
						usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
						
						SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
						
					}
				}
			}
			
		}
		
		/*if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			
			UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
			
			if(jwtUtil.validateToken(jwt, userDetails)) {
				
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				
				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
				
			}
		}*/
		filterChain.doFilter(request, response);
	}
}