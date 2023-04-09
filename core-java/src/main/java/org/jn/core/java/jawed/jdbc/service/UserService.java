package org.jn.core.java.jawed.jdbc.service;

import java.sql.Connection;
import java.util.List;

import org.jn.core.java.jawed.jdbc.model.User;
import org.jn.core.java.jawed.jdbc.repository.UserRepository;
import org.jn.core.java.jawed.jdbc.util.GetSqlConnection;

public class UserService {
	
	private Connection con = null;
	
	public UserService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<User> getAllUser(){
		return UserRepository.getAllUser(con);
	}
	
	public User findUserById(long id){
		return UserRepository.findUserById(con, id);
	}
	
	public int deleteUserById(long userId) {
		return UserRepository.deleteUserById(con, userId);
	}
	
	public void createUser(User user) {
		UserRepository.createUser(con, user);
	}
	
	
	public void updateUser(User user) {
		UserRepository.updateUser(con, user);
	}
	
	public List<User> getUserByName(String name){
		return UserRepository.getUserByName(con, name);
	}
}
