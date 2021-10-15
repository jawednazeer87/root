package org.la.core.java.student.nizaam.jdbc.controller;

import java.util.List;

import org.la.core.java.student.nizaam.jdbc.model.User;
import org.la.core.java.student.nizaam.jdbc.service.UserService;

public class UserController {
	
	public static void main(String[] args) {
		UserService us = new UserService();
		
		try {
			//us.create("Nizaam", "nizaam.s.m@gmail.com", 29);
			List<User> usL = us.findByAge(29);
			for(User usr : usL){
				System.out.println(usr.toString());
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
