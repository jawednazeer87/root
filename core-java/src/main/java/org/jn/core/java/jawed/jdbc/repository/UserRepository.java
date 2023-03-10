package org.jn.core.java.jawed.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.jawed.jdbc.model.User;

public class UserRepository {
	
	private UserRepository() {}
	
	public static List<User> getAllUser(Connection con) {
		System.out.println("-----------getAllUser------------");
		Statement stmt = null;
		ResultSet rs = null;
		List<User> userList = new ArrayList<>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(" select * from user ");
			if(rs!=null) {
				while(rs.next())  {
					User user = new User();
					user.setId(rs.getInt("id"));
					user.setFirstName(rs.getString("firstName"));
					user.setLastName(rs.getString("lastName"));
					user.setDob(rs.getDate("dob"));
					user.setEmail(rs.getString("email"));
					user.setFatherName(rs.getString("fatherName"));
					user.setGender(rs.getBoolean("gender"));
					user.setCountry(rs.getString("country"));
					user.setQualification(rs.getString("qualification"));
					user.setCreatedDate(rs.getDate("created_date"));
					user.setUpdatedDate(rs.getDate("updated_date"));
					userList.add(user);
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return userList;
	}
	
	public static User findUserById(Connection con, long userId) {
		System.out.println("-----------findUserById userid: "+userId);
		ResultSet rs = null;
		User user = null;
		PreparedStatement pStatement = null;
		try {
			String query = " select * from user where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, userId);
			rs = pStatement.executeQuery();
			if(rs!=null) {
				while(rs.next())  {
					user = new User();
					user.setId(rs.getInt("id"));
					user.setFirstName(rs.getString("firstName"));
					user.setLastName(rs.getString("lastName"));
					user.setDob(rs.getDate("dob"));
					user.setEmail(rs.getString("email"));
					user.setFatherName(rs.getString("fatherName"));
					user.setGender(rs.getBoolean("gender"));
					user.setCountry(rs.getString("country"));
					user.setQualification(rs.getString("qualification"));
					user.setCreatedDate(rs.getDate("created_date"));
					user.setUpdatedDate(rs.getDate("updated_date"));
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return user;
	}
	
	public static void createUser(Connection con, User user) {
		System.out.println("-----------createUser------------");
		PreparedStatement pStatement = null;
		try{  
			//conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlDate = new java.sql.Date(user.getDob().getTime());
			String query = " INSERT INTO user(firstName, lastName, dob, email, "
							+ " fatherName, gender, country, qualification, "
							+ " created_date, updated_date) "
							+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, user.getFirstName());
			pStatement.setString(2, user.getLastName());
			pStatement.setDate(3, sqlDate);
			pStatement.setString(4, user.getEmail());
			pStatement.setString(5, user.getFatherName());
			pStatement.setBoolean(6, user.getGender());
			pStatement.setString(7, user.getCountry());
			pStatement.setString(8, user.getQualification());
			pStatement.setDate(9, new java.sql.Date(user.getCreatedDate().getTime()));
			pStatement.setDate(10, new java.sql.Date(user.getUpdatedDate().getTime()));
			int executeUpdate = pStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("data created successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to insert data: "+executeUpdate);
			}
		}
		catch(SQLException se){
		      se.printStackTrace();
		}
		catch(Exception e){ 
			System.out.println(e);
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void updateUser(Connection con, User user) {
		System.out.println("-----------updateUser------------");
		PreparedStatement pStatement = null;
		try{  
			//conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlDate = new java.sql.Date(user.getDob().getTime());
			String query = " update user set firstName=?, lastName=?, dob=?, "
							+ " email=?, fatherName=?, gender=?, country=?,"
							+ " qualification=?, created_date=?, updated_date=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, user.getFirstName());
			pStatement.setString(2, user.getLastName());
			pStatement.setDate(3, sqlDate);
			pStatement.setString(4, user.getEmail());
			pStatement.setString(5, user.getFatherName());
			pStatement.setBoolean(6, user.getGender());
			pStatement.setString(7, user.getCountry());
			pStatement.setString(8, user.getQualification());
			pStatement.setDate(9, new java.sql.Date(user.getCreatedDate().getTime()));
			pStatement.setDate(10, new java.sql.Date(user.getUpdatedDate().getTime()));
			pStatement.setInt(11, user.getId());
			int executeUpdate = pStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("data updated successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to update data: "+executeUpdate);
			}
		}
		catch(SQLException se){
		      se.printStackTrace();
		}
		catch(Exception e){ 
			System.out.println(e);
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static int deleteUserById(Connection con, long userId) {
		System.out.println("-----------deleteUserById userid: "+userId);
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		try {
			String query = " delete from user where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, userId);
			executeUpdate = pStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("data deleted successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to delete data: "+executeUpdate);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return executeUpdate;
	}
	
	public static List<User> getUserByName(Connection con, String name){
		System.out.println("name: "+name);
		List<User> userList = new ArrayList<>();
		String query = " select * from user where firstname like ? "; 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + name + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				user.setDob(rs.getDate("dob"));
				user.setEmail(rs.getString("email"));
				user.setFatherName(rs.getString("fatherName"));
				user.setGender(rs.getBoolean("gender"));
				user.setCountry(rs.getString("country"));
				user.setQualification(rs.getString("qualification"));
				user.setCreatedDate(rs.getDate("created_date"));
				user.setUpdatedDate(rs.getDate("updated_date"));
				userList.add(user);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return userList;
	}
}
