package org.la.ecom.portal.teacher.config;

import org.la.ecom.portal.teacher.jwt.JwtRequestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.csrf().disable().cors()
			.and()
				.authorizeRequests().antMatchers("/login").permitAll()
			.and()
				.authorizeRequests().antMatchers("/registration").permitAll()
			.and()
				.authorizeRequests().antMatchers("/css/**", "/js/**", "/img/**", "/**/favicon.ico", "/webjars/**").permitAll()
			.and()
				.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class)
            	.sessionManagement().sessionCreationPolicy( SessionCreationPolicy.STATELESS );
			
	}
	
}

