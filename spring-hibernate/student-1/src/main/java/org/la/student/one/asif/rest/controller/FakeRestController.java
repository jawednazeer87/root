package org.la.student.one.asif.rest.controller;

import org.la.student.one.asif.service.FakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fake")
public class FakeRestController {

	@Autowired
	FakeService fakeService;
	
	@GetMapping("/byname")
	public String byName() {
		return fakeService.findByName();
	}
	
	
}
