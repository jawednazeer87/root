package org.la.ecom.msql.rest.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@GetMapping("/hello")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String get() {
		return "hello world get admin";
	}
	
	@PostMapping("/hello")
	@PreAuthorize("hasRole('ROLE_USER')")
	public String post() {
		return "hello world post user";
	}
}
