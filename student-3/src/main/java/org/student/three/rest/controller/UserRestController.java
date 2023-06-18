package org.student.three.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.student.three.model.User;
import org.student.three.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	List<User> userList = new ArrayList<>();
	
	@DeleteMapping("/delete-by-id/{id}")
	public void deleteById(@PathVariable long id) {
		userService.deleteById(id); 
	}
	
	@PutMapping("/update-father-name-by-email/{email}")
	public User updateByEmail(@PathVariable String email, @RequestParam String fatherName) {
		return userService.updateByEmail(email, fatherName);
	}
	
	@GetMapping("/find_by_email/{email}")
	public User findByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}
	
	@GetMapping("/find-by-first-name")
	List<User> findByFirstName(@RequestParam String firstName) {
		return userService.findByFirstName(firstName);
	}
	
	@PostMapping("/add")
	public User add(@RequestBody User user) {
		System.out.println(user);
		userList.add(user);
		return user;
	}
	
	@PostMapping("/create")
	public User create(@RequestBody User user) {
		return userService.create(user);
	}
	
	@GetMapping("/get/all")
	public List<User> getAll() {
		return userService.getAll();
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
