package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Aeroplane;

public class AeroplaneRepository {
	
	
	public static List<Aeroplane> getAllAeroplane(Connection con){
		List<Aeroplane> aeroplaneList = new ArrayList<>();
		String query = "Select * from aeroplane";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				Aeroplane aeroplane = new Aeroplane();
				aeroplane.setId(rs.getInt("id"));
				aeroplane.setName(rs.getString("Name"));
				aeroplane.setCapacity(rs.getInt("capacity"));
				aeroplane.setCompanyName("company_name");
				aeroplane.setModelName(rs.getString("model_name"));
				aeroplane.setCreatedDate(rs.getDate("created_date"));
				aeroplane.setUpdatedDate(rs.getDate("updated_date"));
				aeroplaneList.add(aeroplane);
			}
		}
		catch(Exception e)
		{
			System.out.println("Something went Wrong");
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null)
				{
					stmt.close();
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
		return aeroplaneList;
	}
	
	//find aeroplane by id
	public static Aeroplane findAeroplanebyId(Connection con, int id)
	{
		String query = "select * from aeroplane where id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				Aeroplane aeroplane = new Aeroplane();
				aeroplane.setId(rs.getInt("id"));
				aeroplane.setName(rs.getString("Name"));
				aeroplane.setCapacity(rs.getInt("capacity"));
				aeroplane.setCompanyName(rs.getString("company_name"));
				aeroplane.setModelName(rs.getString("model_name"));
				aeroplane.setCreatedDate(rs.getDate("created_date"));
				aeroplane.setUpdatedDate(rs.getDate("updated_date"));
				return aeroplane;
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
		return null;
		
	}
	
	
	//update attendee
	public static void updateAttendee(Connection con,Aeroplane aeroplane)
	{
		String query = "update aeroplane set Name =?, capacity = ?,company_name=?"
				+ ",model_name=?,updated_date=? where id=?";
		PreparedStatement pstmt = null;
		int count =0;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,aeroplane.getName());
			pstmt.setInt(2, aeroplane.getCapacity());
			pstmt.setString(3, aeroplane.getCompanyName());
			pstmt.setString(4,aeroplane.getModelName());
			java.util.Date utilDate = new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			pstmt.setDate(5, sqlDate);
			pstmt.setInt(6, aeroplane.getId());
			count = pstmt.executeUpdate();
			
			
			
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
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		if(count>0)
		{
			System.out.println(count+" rows updated");
		}
		else {
			System.out.println("No row updated");
		}
	}
	
	//deleteAeroplane
	public static int deleteAeroplane(Connection con,int id)
	{
		String query = "delete from aeroplane where id=?";
		PreparedStatement pstmt= null;
		int count = 0;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			count = pstmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
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
		return count;
	}
	
	//get Aeroplane by name
	public static List<Aeroplane> getAeroplaneByName(Connection con,String name)
	{
		String query = "select * from aeroplane where Name like ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Aeroplane> aeroplaneList = new ArrayList<>();
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, name+"%");
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				Aeroplane aeroplane = new Aeroplane();
				aeroplane.setId(rs.getInt("id"));
				aeroplane.setName(rs.getString("Name"));
				aeroplane.setCapacity(rs.getInt("capacity"));
				aeroplane.setCompanyName(rs.getString("company_name"));
				aeroplane.setModelName(rs.getString("model_name"));
				aeroplane.setCreatedDate(rs.getDate("created_date"));
				aeroplane.setUpdatedDate(rs.getDate("updated_date"));
				aeroplaneList.add(aeroplane);
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
		return aeroplaneList;
	}
	
	
	
}
