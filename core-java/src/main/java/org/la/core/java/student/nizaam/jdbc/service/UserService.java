package org.la.core.java.student.nizaam.jdbc.service;

import java.util.List;

import org.la.core.java.student.nizaam.jdbc.model.User;
import org.la.core.java.student.nizaam.jdbc.repository.UserRepository;

public class UserService {
	
	public void create(String name, String email, int age) throws Exception {
		  UserRepository.createUser(name, email, age);
	}
	
	public List<User> findByAge(int age) throws Exception {
		return UserRepository.findByAge(age);
	}

}
