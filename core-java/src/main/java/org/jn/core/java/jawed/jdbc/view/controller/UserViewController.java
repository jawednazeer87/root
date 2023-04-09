package org.jn.core.java.jawed.jdbc.view.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.jn.core.java.jawed.jdbc.controller.UserController;
import org.jn.core.java.jawed.jdbc.dto.UserDTO;

public class UserViewController {

	public static void main(String[] args) {
		UserViewController uvc = new UserViewController();
		uvc.createUser();
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
		UserController.createUser(userDTO); 
	}
}
