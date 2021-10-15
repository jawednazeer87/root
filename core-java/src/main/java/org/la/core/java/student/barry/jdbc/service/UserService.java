package org.la.core.java.student.barry.jdbc.service;

import java.util.Calendar;
import java.util.List;

import org.la.core.java.student.jdbc.model.User;
import org.la.core.java.student.jdbc.respository.UserRepository;

public class UserService {
	
	  public List<User> findByDob(Calendar calendar) throws Exception {
	        return UserRepository.findByDob(calendar);
	    }

	    public List<User> findByAge(int age) throws Exception {
	        return UserRepository.findByAge(age);
	    }

	    public User findById(int id)  throws Exception {
	        return UserRepository.findById(id);
	    }

	    public void delete(int id)  throws Exception {
	        UserRepository.delete(id);
	    }

	    public List<User> findAll()  throws Exception{
	        return UserRepository.findAll();
	    }

	    public void create(String email, String name, int age)  throws Exception {
	        UserRepository.create(email, name, age);
	    }

}
