package org.la.ecom.secure.config;

import org.dozer.DozerBeanMapper;
import org.la.ecom.secure.security.filter.JwtRequestFilter;
import org.la.ecom.secure.service.CustomUserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	private final Logger log = LoggerFactory.getLogger(SecurityConfiguration.class);
	
	@Autowired
	private CustomUserDetailsService userDetailsService;
	
	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.csrf().disable().cors()
            .and()
            	.sessionManagement().sessionCreationPolicy( SessionCreationPolicy.STATELESS )
			.and()
				.authorizeRequests().antMatchers("/authenticate").permitAll()
			.and()
				.authorizeRequests().antMatchers("/registration").permitAll()
	/*		.and()
				.authorizeRequests().antMatchers("/employees/delete/**").permitAll()
			.and()
				.authorizeRequests().antMatchers("/employees/add").permitAll() */
			.and()
				.authorizeRequests().anyRequest().authenticated();
	
		http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
	}
	
	@Bean
    public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
    }
	
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		
		return super.authenticationManagerBean();
	}
	
	@Bean
	public DozerBeanMapper dozerBeanMapper() {
		return new DozerBeanMapper();
	}
	
}
