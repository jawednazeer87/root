package org.jn.adv.student.tanseer.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Users;

public class UsersRepository {
	
	public static void create(Connection con, Users users)
	{
		System.out.println("------- User details Inserted---------");
		PreparedStatement pStatement = null;
		
		try {
			
			String query = "INSERT INTO users( id, full_name, email, gender, date_of_birth, country_code, created_at )"
			+ "VALUES(?,?,?,?,?,?,?)";
			
			pStatement = con.prepareStatement(query);
			
			pStatement.setInt(1, users.getId());
			pStatement.setString(2, users.getFullName());
			pStatement.setString(3, users.getEmail());
			pStatement.setBoolean(4, users.isGender());
			pStatement.setDate(5, Date.valueOf(users.getDob()));
			pStatement.setInt(6, users.getCountryCode());
			pStatement.setString(7, users.getCreatedAt());
			
			int executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate > 0) {
				System.out.println("-----Data Inserted Successfully-----"+executeUpdate);
			}
			else {
				System.out.println("-----Failed to inserted data-----"+executeUpdate);
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		finally {
			try {
				if(pStatement != null) {
					pStatement.close();
				}
			}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
	public static List<Users> getAll(Connection con) {

		System.out.println("-----------Getting All Users------------");
		System.out.println();
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Users> usersList = new ArrayList<>();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from users");

			if(rs!=null) {
				while(rs.next())  {
					Users users = createObject(rs);
					usersList.add(users);
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			freeResources(stmt, rs);
		}
		return usersList;
		}
	
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
	
	private static Users createObject(ResultSet rs) throws SQLException {
		Users users = new Users();
		users.setId(rs.getInt("id"));
		users.setFullName(rs.getString("full_name"));
		users.setEmail(rs.getString("email"));
		users.setGender(rs.getBoolean("gender"));
		users.setDob(rs.getDate("date_of_birth").toLocalDate());
		users.setCountryCode(rs.getInt("country_code"));
		users.setCreatedAt(rs.getString("created_at"));
		return users;
	}
}
