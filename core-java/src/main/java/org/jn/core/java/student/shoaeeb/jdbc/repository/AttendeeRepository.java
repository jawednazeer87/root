package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Attendee;

public class AttendeeRepository {

	public static List<Attendee> getAllAttendee(Connection con)
	{
		
		Statement stmt = null;
		List<Attendee> attendeeList = new ArrayList<>();
		try {
			stmt = con.createStatement();
			String query  = "select * from attendee";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				Attendee attendee = new Attendee();
				attendee.setAttendeeId(rs.getInt(1));
				attendee.setFirstName(rs.getString(2));
				attendee.setLastName(rs.getString(3));
				attendee.setPhone(rs.getString(4));
				attendee.setEmail(rs.getString(5));
				attendee.setVip(rs.getString(6));
				attendeeList.add(attendee);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return attendeeList;
		
	}
	
	//find user by id
	public static Attendee findAttendeeById(Connection con, int attendeeId)
	{
		String query = "select * from attendee where attendee_id = ?";
		PreparedStatement pstmt  = null;
		ResultSet rs = null;
		Attendee attendee = new Attendee();
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, attendeeId);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				attendee.setAttendeeId(rs.getInt(1));
				attendee.setFirstName(rs.getString(2));
				attendee.setLastName(rs.getString(3));
				attendee.setPhone(rs.getString(4));
				attendee.setEmail(rs.getString(5));
				attendee.setVip(rs.getString(6));
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt != null )
				{
					pstmt.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		return attendee;
		
	}
	
	public static void createAttendee(Connection con,Attendee attendee)
	{
		String query = "insert into attendee values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		int executeUpdate = 0;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, attendee.getAttendeeId());
			pstmt.setString(2,attendee.getFirstName());
			pstmt.setString(3, attendee.getLastName());
			pstmt.setString(4,attendee.getPhone());
			pstmt.setString(5, attendee.getEmail());
			pstmt.setString(6, attendee.getVip());
			executeUpdate = pstmt.executeUpdate();
			if(executeUpdate > 0)
			{
				System.out.println("data created successfully");
			}
			else {
				System.out.println("failed to create data");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				
			
			if(pstmt!=null)
			{
				pstmt.close();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
			
		}
	
		
	}
	
	public static void updateAttendee(Connection con , Attendee attendee)
	{
		int executeUpdate = 0;
		String query = "update attendee set first_name=?,last_name=?,phone=?,email=?,vip=? where attendee_id=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, attendee.getFirstName());
			pstmt.setString(2, attendee.getLastName());
			pstmt.setString(3,attendee.getPhone());
			pstmt.setString(4, attendee.getEmail());
			pstmt.setString(5, attendee.getVip());
			pstmt.setInt(6,attendee.getAttendeeId());
			executeUpdate = pstmt.executeUpdate();
			if(executeUpdate > 0)
			{
				System.out.println("Updated data Successfully");
			}
			else {
				System.out.println("Failed to update data");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt!=null)
				{
					pstmt.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	//delete user by id
	public static int deleteAttendee(Connection con, int id)
	{
		int executeUpdate = 0;
		PreparedStatement pstmt = null;
		String query = "Delete from attendee where attendee_id=?";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,id);
			executeUpdate = pstmt.executeUpdate();
			if(executeUpdate > 0)
			{
				return executeUpdate;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt !=null)
				{
					pstmt.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	//get attendee by name
	public static List<Attendee> getAttendeeByName(Connection con,String name)
	{
		List<Attendee> attendeeList = new ArrayList<>();
		PreparedStatement pstmt = null ;
		ResultSet rs = null;
		String query  = "Select * from attendee where first_name = ? ";
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,name);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
			  Attendee attendee = new Attendee();
			  attendee.setAttendeeId(rs.getInt(1));
			  attendee.setFirstName(rs.getString(2));
			  attendee.setLastName(rs.getString(3));
			  attendee.setPhone(rs.getString(4));
			  attendee.setEmail(rs.getString(5));
			  attendee.setVip(rs.getString(6));
			  attendeeList.add(attendee);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt!=null)
				{
					pstmt.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			try {
				if(rs!=null)
				{
					rs.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		return attendeeList;
	}
	
	
	
	
	
}
