package org.ecom.nizam.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ecom.nizam.model.User;
import org.ecom.nizam.repository.UserRepository;
import org.ecom.util.GetSqlConnection;

public class UserService {

private Connection con = null;
	
	public UserService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
public User findUserById(long id){
		
		User user = null;
		
		if(con!=null) {
			user = UserRepository.findById(con, id);
		}
		
		return user;
	}

public void updateUser(User user) {
	UserRepository.updateUser(con, user);
}


	public List<User> getAllUser(){
		
		List<User> userList = new ArrayList<>();
		
		if(con!=null) {
			userList = UserRepository.getAllUser(con);
		}
		
		return userList;
	}

	public void createUser(User user) throws SQLException {
		UserRepository.createUser(con, user);
	}

	public int deleteUserById(long userId) {
		return UserRepository.deleteUserById(con, userId);
	}
	
	public List<User> getUserByName(String name){
		return UserRepository.getUserByName(con, name);
	}
}
