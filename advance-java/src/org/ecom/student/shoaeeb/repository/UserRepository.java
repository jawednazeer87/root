package org.ecom.student.shoaeeb.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.student.shoaeeb.model.User;

public class UserRepository {
	//get all user
	public static List<User> getAllUser(Connection con)
	{
		System.out.println("-----get all user----");
		Statement stmt = null;
		ResultSet rs = null;
		List<User> list = new ArrayList<>();
		String query = "select * from user";
		try {
			stmt=con.createStatement();
			rs = stmt.executeQuery(query);
			if(rs!=null)
			{
				while(rs.next())
				{
					User user = new User();
					user.setId(rs.getInt(1));
					user.setFirstName(rs.getString(2));
					user.setLastName(rs.getString(3));
					user.setDob(rs.getDate(4));
					user.setEmail(rs.getString(5));
					user.setFatherName(rs.getString(6));
					user.setGender(rs.getBoolean(7));
					list.add(user);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
				{
					stmt.close();
				}
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			try {
				if(rs!=null)
				{
					rs.close();
				}
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return list;
	}
	
	//find user by id
	public static User findUserById(Connection con,long id)
	{
		String query = "select * from user where id=?";
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		User user = null;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setLong(1, id);
			rs = pstmt.executeQuery();
			if(rs!=null)
			{
				while(rs.next())
				{
					user = new User();
					user.setId(rs.getInt(1));
					user.setFirstName(rs.getString(2));
					user.setLastName(rs.getString(3));
					user.setDob(rs.getDate(4));
					user.setEmail(rs.getString(5));
					user.setFatherName(rs.getString(6));
					user.setGender(rs.getBoolean(7));
					user.setCountry(rs.getString(8));
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt!=null)
				{
					pstmt.close();
				}
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			try {
				if(rs!=null)
				{
					rs.close();
				}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
		return user;
}
	
		//create user
		public static void createUser(Connection con,User user)
		{
			System.out.println("------createUser----");
			PreparedStatement pstmt = null;
			String query = "insert into user (firstName,lastName,dob,email"
					+ ",fatherName,gender,country) values(?,?,?,?,?,?,?)";
			java.sql.Date sqlDate = new java.sql.Date(user.getDob().getTime());
			
			try {
				pstmt=con.prepareStatement(query);
				pstmt.setString(1, user.getFirstName());
				pstmt.setString(2,user.getLastName());
				pstmt.setDate(3, sqlDate);
				pstmt.setString(4, user.getEmail());
				pstmt.setString(5, user.getFatherName());
				pstmt.setBoolean(6, user.getGender());
				pstmt.setString(7, user.getCountry());
				int count =  pstmt.executeUpdate();
				if(count>=1)
				{
					System.out.println("data inserted successfully"+count);
				}
				else {
					System.out.println("something went wrong no data insertedd");
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				try {
					if(pstmt!=null)
					{
						pstmt.close();
					}
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			
		}
		
		//update user
		public static void updateUser(Connection con,User user)
		{
			System.out.println("---update user---");
			PreparedStatement pstmt = null;
			String query = "update user set firstName=?,lastName=?,dob=?,email=?,fatherName=?,"
					+ "gender=?,country=?where id =?";
			java.sql.Date sqlDate = new java.sql.Date(user.getDob().getTime());
			try {
				pstmt=con.prepareStatement(query);
				pstmt.setString(1, user.getFirstName());
				pstmt.setString(2,user.getLastName());
				pstmt.setDate(3,sqlDate); 
				pstmt.setString(4, user.getEmail());
				pstmt.setString(5, user.getFatherName());
				pstmt.setBoolean(6, user.getGender());
				pstmt.setString(7, user.getCountry());
				pstmt.setInt(8, user.getId());
				int count = pstmt.executeUpdate();
				if(count>=1)
				{
					System.out.println("Data updated Successfully"+count);
				}
				else {
					System.out.println("Something went wrong Data failed to update");
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				try {
					if(pstmt!=null)
					{
						pstmt.close();
					}
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
					
		}
		public static int  deleteUserById(Connection con,long id)
		{
			System.out.println("-----deleteUserById:"+id);
			String query = "delete from user where id=?";
			PreparedStatement pstmt =null;
			int count=0;
			try {
			pstmt=con.prepareStatement(query);
			pstmt.setLong(1, id);
			count = pstmt.executeUpdate();
			if(count>=1)
			{
				System.out.println("data deleted successfully");
			}
			else {
				System.out.println("not deleted");
			}
				
			}catch(Exception e)
			{
					e.printStackTrace();
			}
			finally {
				try {
					if(pstmt!=null)
					{
						pstmt.close();
					}
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			return count;
			
		}
		
		//get user by name
		public static List<User> getUserByName(Connection con,String name)
		{
			System.out.println("----getUserByName------");
			List<User> userList = new ArrayList<>();
			String query = "select * from user where firstName like ?";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				pstmt=con.prepareStatement(query);
				pstmt.setString(1, "%"+name+"%");
				rs = pstmt.executeQuery();
				while(rs.next())
				{
					User user = new User();
					user.setId(rs.getInt(1));
					user.setFirstName(rs.getString(2));
					user.setLastName(rs.getString(3));
					user.setDob(rs.getDate(4));
					user.setEmail(rs.getString(5));
					user.setFatherName(rs.getString(6));
					user.setGender(rs.getBoolean(7));
					userList.add(user);
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				try {
					if(pstmt!=null)
					{
						pstmt.close();
					}
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			return userList;
		}
		
		//search
		public static List<User> search(Connection con,String firstName,String lastName,String email)
		{
			List<User> list = new ArrayList<>();
			String query = "select * from user where 1=1";
			Statement stmt=null;
			ResultSet rs = null;
			PreparedStatement pstmt = null;
			try {
				pstmt=con.prepareStatement(query);
				rs=pstmt.executeQuery();
				while(rs.next())
				{
					User user = new User();
					user.setId(rs.getInt(1));
					user.setFirstName(rs.getString(2));
					user.setLastName(rs.getString(3));
					user.setDob(rs.getDate(4));
					user.setEmail(rs.getString(5));
					user.setFatherName(rs.getString(6));
					user.setGender(rs.getBoolean(7));
					list.add(user);
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				try {
					if(rs!=null)
					{
						rs.close();
					}
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			return list;
		}
}
