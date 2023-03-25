package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Bread;

public class BreadRepository {
	
	public static List<Bread> getAllBread(Connection con)
	{
		String query="select * from bread";
		Statement stmt=null;
		ResultSet rs = null;
		List<Bread> list = new ArrayList<>();
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				Bread bread = new Bread();
				bread.setId(rs.getInt("id"));
				bread.setName(rs.getString("name"));
				bread.setCreatDate(rs.getDate("creatDate"));
				bread.setExpDate(rs.getDate("expDate"));
				bread.setType(rs.getString("type"));
				bread.setEmailOrg(rs.getString("email"));
				list.add(bread);
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
	
	public static Bread findBreadById(Connection con,int id)
	{
		String query = "select * from bread where id=?";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Bread bread = new Bread();

		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs  = pstmt.executeQuery();

			while(rs.next())
			{
				bread.setId(rs.getInt("id"));
				bread.setName(rs.getString("name"));
				bread.setCreatDate(rs.getDate("creatDate"));
				bread.setExpDate(rs.getDate("expDate"));
				bread.setType(rs.getString("type"));
				bread.setEmailOrg(rs.getString("email"));
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
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		return bread;
		
	}
	
	public static int createBread(Connection con,Bread bread)
	{
		int count=0;
		String query = "insert into bread(name,creatDate,expDate,type,email)"
				+ "values(?,?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, bread.getName());
			java.sql.Date sqlDate = new java.sql.Date(bread.getCreatDate().getTime());
			pstmt.setDate(2,sqlDate);
			sqlDate = new java.sql.Date(bread.getExpDate().getTime());
			pstmt.setDate(3, sqlDate);
			pstmt.setString(4, bread.getType());
			pstmt.setString(5, bread.getEmailOrg());
			count=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	
	public static int updateBreadById(Connection con,Bread bread)
	{
		String query = "update bread set name=?,creatDate=?,expDate=?,type=?,email=? where id=?";
		PreparedStatement pstmt=null;
		int count=0;
		
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,bread.getName());
			java.sql.Date sqlDate = new java.sql.Date(bread.getCreatDate().getTime());
			pstmt.setDate(2, sqlDate);
			sqlDate = new java.sql.Date(bread.getExpDate().getTime());
			pstmt.setDate(3, sqlDate);
			pstmt.setString(4, bread.getType());
			pstmt.setString(5,bread.getEmailOrg());
			pstmt.setInt(6, bread.getId());
			count=pstmt.executeUpdate();
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
			
		}
		return count;
	}
	
}
