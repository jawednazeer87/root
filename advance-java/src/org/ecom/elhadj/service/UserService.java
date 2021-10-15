package org.ecom.elhadj.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.elhadj.model.User;
import org.ecom.elhadj.repository.UserRepository;
import org.ecom.util.GetSqlConnection;


public class UserService {
	
	private Connection con = null;
	
	public UserService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<User> getAllUser(){
		
		List<User> userList = new ArrayList<>();
		
		if(con!=null) {
			userList = UserRepository.getAllUser(con);
		}
		
		return userList;
	}
	
	public User findUserById(long id){
		
		User user = null;
		
		if(con!=null) {
			user = UserRepository.findUserById(con, id);
		}
		
		return user;
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
