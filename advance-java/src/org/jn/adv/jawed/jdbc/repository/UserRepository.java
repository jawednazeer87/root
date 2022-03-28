package org.jn.adv.jawed.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.jdbc.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserRepository {	//DAO Data Access Object

	static Logger log = LoggerFactory.getLogger(UserRepository.class);
	
	private static void freeResources(Statement stmt, ResultSet rs) {
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
	
	public static List<User> getAllUser(Connection con) {

		log.info("-----------getAllUser------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<User> userList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(" select * from user ");
			if(rs!=null) {
				while(rs.next())  {
					userList.add(createObject(rs));
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			freeResources(stmt, rs);
		}
		return userList;
	}
	
	public static User findUserById(Connection con, long userId) {

		log.info("-----------findUserById userid: {}", userId);

		ResultSet rs = null;
		User user = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from user where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, userId);
			rs = pStatement.executeQuery();
			if(rs!=null && rs.next()) {
				user = createObject(rs);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			freeResources(pStatement, rs);
		}
		return user;
	}
	
	public static void createUser(Connection con, User user) {
		
		log.info("-----------createUser------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
			Date sqlDate = Date.valueOf(user.getDob());
			
			String query = 	  "INSERT INTO user(firstName, lastName, dob, email, fatherName, gender, country) "
							+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, user.getFirstName());
			pStatement.setString(2, user.getLastName());
			pStatement.setDate(3, sqlDate);
			pStatement.setString(4, user.getEmail());
			pStatement.setString(5, user.getFatherName());
			pStatement.setBoolean(6, user.getGender());
			pStatement.setString(7, user.getCountry());
			
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate>0) {
				log.info("data created successfully: {}", executeUpdate);
			}
			else {
				log.info("failed to insert data: {}", executeUpdate);
			}
		}
		catch(SQLException se){
		      se.printStackTrace();
		}
		catch(Exception e){ 
			log.error(e.toString());
		} 
		finally {
			freeResources(pStatement, null);
		}
	}
	
	public static void updateUser(Connection con, User user) {
		
		log.info("-----------updateUser------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
			Date sqlDate = Date.valueOf(user.getDob());
			
			String query = 	  " update user set firstName=?, lastName=?, dob=?, email=?, fatherName=?, gender=? "
							+ " , country=? where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, user.getFirstName());
			pStatement.setString(2, user.getLastName());
			pStatement.setDate(3, sqlDate);
			pStatement.setString(4, user.getEmail());
			pStatement.setString(5, user.getFatherName());
			pStatement.setBoolean(6, user.getGender());
			pStatement.setString(7, user.getCountry());
			pStatement.setInt(8, user.getId());
			
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate>0) {
				log.info("data updated successfully: {}  ", executeUpdate);
			}
			else {
				log.info("failed to update data: {}", executeUpdate);
			}
		}
		catch(SQLException se){
		      se.printStackTrace();
		}
		catch(Exception e){ 
			log.error(e.toString());
		} 
		finally {
			freeResources(pStatement, null);
		}
	}

	public static int deleteUserById(Connection con, long userId) {

		log.info("-----------deleteUserById userid: {}", userId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from user where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, userId);
			executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate>0) {
				log.info("data deleted successfully: {}", executeUpdate);
			}
			else {
				log.info("failed to delete data: {}", executeUpdate);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			freeResources(pStatement, null); 
		}
		
		return executeUpdate;
	}
	
	public static List<User> getUserByName(Connection con, String name){
		
		log.info("name: {}", name);
		List<User> userList = new ArrayList<>();
		String query = " select * from user where firstname like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setString(1,  "%" + name + "%");
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				userList.add(createObject(rs));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			freeResources(null, rs); 
		}
		return userList;
	}
	
	public static List<User> search(Connection con, String firstName, String lastName, String email){
		
		
		List<User> userList = new ArrayList<>();
		String query = " select * from user where 1=1 "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			//pStatement.setString(1,  "%" + firstName + "%");
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				userList.add(createObject(rs));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			freeResources(null, rs); 
		}
		return userList;
	}
	
	private static User createObject(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setDob(rs.getDate("dob").toLocalDate());
		user.setEmail(rs.getString("email"));
		user.setFatherName(rs.getString("fatherName"));
		user.setGender(rs.getBoolean("gender"));
		return user;
	}
	
	public static List<User> getByDobRange(Connection con, LocalDate startDate, LocalDate endDate) {
		
		List<User> userList = new ArrayList<>();
		String query = " select * from user where dob between ? and ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1, Date.valueOf(startDate));
			pStatement.setDate(2, Date.valueOf(endDate));
			
			rs = pStatement.executeQuery();
			while(rs.next())  {
				User user = createObject(rs);
				userList.add(user);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			freeResources(null, rs);  
		}
		return userList;
	}
}
