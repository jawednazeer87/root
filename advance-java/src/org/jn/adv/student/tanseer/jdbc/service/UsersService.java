package org.jn.adv.student.tanseer.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Users;
import org.jn.adv.student.tanseer.jdbc.repository.UsersRepository;
import org.jn.adv.student.tanseer.jdbc.util.GetSqlConnection;

public class UsersService {
	
	private Connection con = null;
	
	public UsersService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose()
	{
		GetSqlConnection.connectionClose();
	}
	
	public void create(Users users)
	{
		UsersRepository.create(con, users);
	}
	
	public List<Users> getAll(){
		List<Users> usersList = new ArrayList<Users>();
		
		if(con != null) {
			usersList = UsersRepository.getAll(con);
		}
		
		return usersList;
	}
}
