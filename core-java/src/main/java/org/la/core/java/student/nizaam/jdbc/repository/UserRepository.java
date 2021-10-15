package org.la.core.java.student.nizaam.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.la.core.java.student.nizaam.jdbc.model.User;
import org.la.core.java.student.nizaam.jdbc.util.ConnectionUtil;

public class UserRepository {
	
	private static Connection connection = null;
	
	public static List<User> findByAge(int age) throws Exception{
		
		connection = ConnectionUtil.OpenConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> userL = new ArrayList<>();
		
		try {		
			String query = "Select * from user where age=?";
			ps =  connection.prepareStatement(query);
			ps.setInt(1, age);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				User usr = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				userL.add(usr);
				
			}					
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(ps !=null)
					ps.close();
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			try {
				if(rs!=null)
					rs.close();
			}
			catch (Exception exp) {
				System.out.println(exp);
			}
			connection.close();
				
		}
		return userL;
	}
	
	public static void createUser(String name, String email , int age) throws Exception {
		connection = ConnectionUtil.OpenConnection();				
		PreparedStatement ps = null;
		int rs = 0;
		
		try {
			String query = "Insert into user(name,email,age) values(?,?,?) ";
			ps = connection.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setInt(3, age);
			rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("Successfully created user : "+ rs);
			}
			else
				System.out.println("User creation failed : "+ rs);
		}catch(Exception e) {
			System.out.println("..."+e.getMessage());
		}finally {
			try {
				if(ps !=null)
					ps.close();
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			
			connection.close();
				
		}
		
		 
	}

}
