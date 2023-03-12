package org.jn.core.java.jawed.jdbc.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.jn.core.java.jawed.jdbc.dto.UserDTO;
import org.jn.core.java.jawed.jdbc.model.User;
import org.jn.core.java.jawed.jdbc.service.UserService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UserController {

	public static void main(String[] args) {
		UserController uc = new UserController();
//		uc.createUser();
//		uc.displayAllUser();
//		uc.findUserById();
//		uc.deleteUserById();
		uc.updateUser();
//		uc.getUserByName();
	}
	
	void getUserByName() {
		String name = "ahmed";
		UserService userService = new UserService();
		List<User> userList = userService.getUserByName(name);
		print(userList);
	}
	void updateUser() {
		LocalDate localDate = LocalDate.of(2000, 07, 23);
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1);
		userDTO.setFirstName("adil");
		userDTO.setLastName("amin");
		userDTO.setDob(date);
		userDTO.setEmail("adil@gmail.com");
		userDTO.setFatherName("zakir khan");
		userDTO.setGender(true);
		userDTO.setCountry("India");
		userDTO.setQualification("Graduate");
		localDate = LocalDate.now();
		date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		userDTO.setUpdatedDate(date);
		UserService userService = new UserService();
		Gson gson = new Gson();
		User user = gson.fromJson(gson.toJson(userDTO), User.class);
		userService.updateUser(user);
	}
	
	void deleteUserById() {
		int id = 2;
		UserService userService = new UserService();
		int res = userService.deleteUserById(id);
		System.out.println("res: " + res);
	}
	void findUserById() {
		int id = 5;
		UserService userService = new UserService();
		User user = userService.findUserById(id);
		Gson gson = new GsonBuilder().setDateFormat("MMM dd, yyyy").create();
		String json = gson.toJson(user);
		System.out.println(json);
		UserDTO userDTO = gson.fromJson(json, UserDTO.class);
		print(userDTO);
	} 
	void createUser() {
		LocalDate localDate = LocalDate.of(1996, 12, 30);
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		UserDTO userDTO = new UserDTO();
		userDTO.setFirstName("ahmed");
		userDTO.setLastName("raza");
		userDTO.setDob(date);
		userDTO.setEmail("ahmed@gmail.com");
		userDTO.setFatherName("muneer ahmed");
		userDTO.setGender(true);
		userDTO.setCountry("India");
		userDTO.setQualification("Graduate");
		localDate = LocalDate.now();
		date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		userDTO.setCreatedDate(date);
		userDTO.setUpdatedDate(date);
		Gson gson = new Gson();
		User user = gson.fromJson(gson.toJson(userDTO), User.class);
		UserService userService = new UserService();
		userService.createUser(user);
		UserDTO userDTO2 = gson.fromJson(gson.toJson(user), UserDTO.class);
		print(userDTO2);
	}
	
	void displayAllUser() {
		UserService userService = new UserService();
		List<User> userList = userService.getAllUser();
		print(userList);
	}
	
	void print(List<User> userList) {
		userList.forEach(System.out::println);
	}
	void print(UserDTO userDTO) {
		System.out.println(userDTO);
	}
}
