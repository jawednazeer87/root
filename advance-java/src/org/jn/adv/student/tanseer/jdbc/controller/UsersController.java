package org.jn.adv.student.tanseer.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.dto.UsersDTO;
import org.jn.adv.student.tanseer.jdbc.model.Users;
import org.jn.adv.student.tanseer.jdbc.service.UsersService;
import org.jn.adv.student.tanseer.jdbc.util.GSONGenericUtil;

public class UsersController {
	
	static UsersService usersservice = new UsersService();
	
	public static void main(String[] args) {
//		create();
		getAll().stream().forEach(System.out::println);
	}
	
	static void create() {
		 Users users = new Users();
		 users.setId(101);
		 users.setFullName("Tanseer");
		 users.setEmail("tanseerahmed@gmail.com");
		 users.setGender(true);
		 LocalDate localDate = LocalDate.of(1998, 05, 17);
		 users.setDob(localDate);
		 users.setCountryCode(560051);
		 users.setCreatedAt("India");
		 
		 usersservice.create(users);
		 usersservice.connectionClose();
	}
	
	static List<UsersDTO> getAll(){

		List<Users> usersList = usersservice.getAll();
		usersservice.connectionClose();

		final List<UsersDTO> dtoList = new ArrayList<>();
		usersList.stream().forEach(users-> {
			UsersDTO dto = GSONGenericUtil.map(users, UsersDTO.class);
			dtoList.add(dto);
		});
		return dtoList;
	}	
}
