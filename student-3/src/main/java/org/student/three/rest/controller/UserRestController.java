package org.student.three.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.student.three.model.User;

@RestController
@RequestMapping("/user")
public class UserRestController {

	List<User> userList = new ArrayList<>();
	
	@PostMapping("/add")
	public User add(@RequestBody User user) {
		System.out.println(user);
		userList.add(user);
		return user;
	}
	
	@GetMapping("/get")
	public List<User> get() {
		return userList;
	}
	
	@GetMapping("/get/{id}")
	public User findId(@PathVariable int id) {
		List<User> collect = userList.stream().filter(user -> user.getId()==id).collect(Collectors.toList());
		return collect.get(0);
	}
}
