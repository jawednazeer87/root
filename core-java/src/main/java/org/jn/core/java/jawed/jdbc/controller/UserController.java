package org.jn.core.java.jawed.jdbc.controller;

import java.util.List;

import org.jn.core.java.jawed.jdbc.dto.UserDTO;
import org.jn.core.java.jawed.jdbc.model.User;
import org.jn.core.java.jawed.jdbc.service.UserService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UserController {
	
	public static void getUserByName(String name) {
		UserService userService = new UserService();
		List<User> userList = userService.getUserByName(name);
		print(userList);
	}
	
	public static void updateUser(UserDTO userDTO) {
		UserService userService = new UserService();
		Gson gson = new Gson();
		User user = gson.fromJson(gson.toJson(userDTO), User.class);
		userService.updateUser(user);
	}
	
	public static void deleteUserById(int id) {
		UserService userService = new UserService();
		int res = userService.deleteUserById(id);
		System.out.println("res: " + res);
	}
	
	public static UserDTO findUserById(int id) {
		UserService userService = new UserService();
		User user = userService.findUserById(id);
		Gson gson = new GsonBuilder().setDateFormat("MMM dd, yyyy").create();
		String json = gson.toJson(user);
		System.out.println(json);
		return gson.fromJson(json, UserDTO.class);
	} 
	
	public static User createUser(UserDTO userDTO) {
		Gson gson = new Gson();
		User user = gson.fromJson(gson.toJson(userDTO), User.class);	//dto to model
		UserService userService = new UserService();
		userService.createUser(user);
		return user;
	}
	
	static void displayAllUser() {
		UserService userService = new UserService();
		List<User> userList = userService.getAllUser();
		print(userList);
	}
	
	static void print(List<User> userList) {
		userList.forEach(System.out::println);
	}
	
	
}
