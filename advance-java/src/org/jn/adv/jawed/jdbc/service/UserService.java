package org.jn.adv.jawed.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.jdbc.model.User;
import org.jn.adv.jawed.jdbc.repository.UserRepository;
import org.jn.adv.jawed.util.GetSqlConnection;

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
	public List<User> getByDobRange(LocalDate startDate, LocalDate endDate) {
		return UserRepository.getByDobRange(con, startDate, endDate);
	}
}
