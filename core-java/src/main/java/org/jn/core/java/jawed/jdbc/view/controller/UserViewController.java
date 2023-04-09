package org.jn.core.java.jawed.jdbc.view.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.jn.core.java.jawed.jdbc.controller.UserController;
import org.jn.core.java.jawed.jdbc.dto.UserDTO;
import org.jn.core.java.jawed.jdbc.model.User;

import com.google.gson.Gson;

public class UserViewController {

	public static void main(String[] args) {
		UserViewController uvc = new UserViewController();
		uvc.createUser();
//		uvc.createUser();
//		uvc.displayAllUser();
//		uvc.findUserById();
//		uvc.deleteUserById();
		uvc.updateUser();
//		uvc.getUserByName();
	}
	
	public static void getUserByName() {
		 UserController.getUserByName("ahmed");
	}
			
	void deleteUserById() {
		int id = 2;
		UserController.deleteUserById(id);
	}
	void findUserById() {
		int id = 5;
		UserDTO userDTO = UserController.findUserById(id);
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
		User user = UserController.createUser(userDTO); 
		Gson gson = new Gson();
		UserDTO userDTO2 = gson.fromJson(gson.toJson(user), UserDTO.class);	//model to dto
		print(userDTO2);
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
		UserController.updateUser(userDTO);
	}
	
	static void print(UserDTO userDTO) {
		System.out.println(userDTO);
	}
}
