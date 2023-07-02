package org.student.three.mirza.rest.controller;

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
import org.student.three.mirza.modal.Users;
import org.student.three.mirzaa.service.UsersService;


@RestController
@RequestMapping("/Users")
public class UsersRestController {

	@Autowired
	private UsersService usersService;
	
	List<Users> usersList = new ArrayList<>();
	
	@DeleteMapping("/delete-by-id/{id}")
	public void deleteById(@PathVariable long id) {
		usersService.deleteById(id); 
	}
	
	@PutMapping("/update-father-name-by-email/{email}")
	public Users updateByEmail(@PathVariable String email, @RequestParam String fatherName) {
		return usersService.updateByEmail(email, fatherName);
	}
	
	@GetMapping("/find_by_email/{email}")
	public Users findByEmail(@PathVariable String email) {
		return usersService.findByEmail(email);
	}
	
	@GetMapping("/find-by-first-name")
	List<Users> findByFirstName(@RequestParam String firstName) {
		return usersService.findByFirstName(firstName);
	}
	
	@PostMapping("/add")
	public Users add(@RequestBody Users users) {
		System.out.println(users);
		usersList.add(users);
		return users;
	}
	
	@PostMapping("/create")
	public Users create(@RequestBody Users users) {
		return usersService.create(users);
	}
	
	@GetMapping("/get/all")
	public List<Users> getAll() {
		return usersService.getAll();
	}
	
	@GetMapping("/get")
	public List<Users> get() {
		return usersList;
	}
	
	@GetMapping("/get/{id}")
	public Users findId(@PathVariable int id) {
		List<Users> collect = usersList.stream().filter(users -> users.getId()==id).collect(Collectors.toList());
		return collect.get(0);
	}
}

