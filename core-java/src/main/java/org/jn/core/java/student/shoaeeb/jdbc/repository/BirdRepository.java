package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Bird;

public class BirdRepository {
	
	public static List<Bird> getAllBird(Connection con)
	{
		
		List<Bird> list = new ArrayList<>();
		Statement stmt = null;
		String query = "select * from bird";
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs =stmt.executeQuery(query);
			while(rs.next())
			{
				Bird bird = new Bird();
				bird.setId(rs.getInt("id"));
				bird.setBirdName(rs.getString("bird_name"));
				bird.setDob(rs.getDate("dob"));
				bird.setCanFly(rs.getBoolean("can_fly"));
				bird.setWeight(rs.getFloat("weight"));
				bird.setHeight(rs.getFloat("Height"));
				bird.setCanSwim(rs.getBoolean("can_swim"));
				list.add(bird);
			}
		}
		catch(Exception e)
		{
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
		return list;
	}
	
	public static int updateBirdById(Connection con,Bird bird)
	{
		int count=0;
		String query = "update  bird set bird_name=?,dob=?"
				+ ",can_fly=?,weight=?,Height=?,can_swim=? where id=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,bird.getBirdName());
			Date date = bird.getDob();
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			pstmt.setDate(2,sqlDate);
			pstmt.setBoolean(3,bird.isCanFly());
			pstmt.setFloat(4, bird.getWeight());
			pstmt.setFloat(5, bird.getHeight());
			pstmt.setBoolean(6,bird.isCanSwim());
			pstmt.setInt(7, bird.getId());
			count = pstmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
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
		return count;
	}
	
	public static  int deleteBirdbById(Connection con, int id)
	{
		int count=0;
		String  query = "delete from bird where id=?";
		PreparedStatement pstmt = null;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			count=pstmt.executeUpdate();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
}
