package org.la.ecom.report.jwt;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.la.ecom.report.template.interceptor.RestTemplateInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtRequestFilter  extends OncePerRequestFilter{
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private RestTemplateInterceptor restTemplateInterceptor;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
	
		final String authorizationHeader = request.getHeader("Authorization");
		
		String username = null;
		String jwt = null;
		
		if(authorizationHeader==null) {
			throw new AccessDeniedException("Forbidden");
		}
		
		if(authorizationHeader!=null && authorizationHeader.startsWith("Bearer ")) {
			
			jwt = authorizationHeader.substring(7);
			username = jwtUtil.extractUsername(jwt);
			restTemplateInterceptor.setAuthorizationHeader(authorizationHeader);
		}
		
		if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			
			if(jwtUtil.validateToken(jwt)) {
				
				Set<SimpleGrantedAuthority> ssga = new HashSet<>();
				
				SimpleGrantedAuthority sga = new SimpleGrantedAuthority("ROLE_ADMIN");
				
				ssga.add(sga);
				
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
						username, null, ssga);
				
				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
				filterChain.doFilter(request, response);
			}
		}
	
	}

}
