package org.la.student.one.rest.controller;

import org.la.student.one.model.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestOneController {

	@GetMapping(value = "/hello")
	public String wish() {
		return "good morning";
	}
	
	@GetMapping(value = "/get/student", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student student() {
		System.out.println("student");
		Student student = new Student(1, "yusuf", "yusuf@mail.com");
		return student;
	}
}


