package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Brands;

public class BrandsRepository {
	
	
	public static List<Brands> getAllBrands(Connection con)
	{
		List<Brands> list = new ArrayList<>();
		String query = "select * from brands";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt=con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				Brands brands = new Brands();
				brands.setId(rs.getInt("id"));
				brands.setBrandName(rs.getString("brand_name"));
				brands.setThumbnails(rs.getString("thumbnails"));
				list.add(brands);
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
	
	public static int updateById(Connection con,Brands brands)
	{
		String query = "update from brands set brand_name=?,thumbnails=? where id=?";
		PreparedStatement pstmt = null;
		int count=0;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, brands.getBrandName());
			pstmt.setString(2,brands.getThumbnails());
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
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return count;
	}
	
	public static Brands findById(Connection con , int id)
	{
		String query ="select from brands where id=?";
		Brands brands = new Brands();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs  = pstmt.executeQuery();
			while(rs.next())
			{
				brands.setId(rs.getInt("id"));
				brands.setBrandName(rs.getString("brand_name"));
				brands.setThumbnails(rs.getString("thumbnails"));
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
		return brands;
	}
}
