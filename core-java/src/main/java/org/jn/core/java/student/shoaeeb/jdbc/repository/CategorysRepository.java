package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Categorys;

public class CategorysRepository {

	public static List<Categorys> getAllCategorys(Connection con)
	{
		String query = "select * from categorys";
		List<Categorys> list  = new ArrayList<>();
		Categorys categorys = new Categorys();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				categorys.setId(rs.getInt("id"));
				categorys.setCategoryName(rs.getString("category_name"));
				categorys.setThumbnails(rs.getString("thumbnails"));
				list.add(categorys);
			}
		}catch(Exception e)
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
	
	//create
	public static int createCategory(Connection con,Categorys categorys)
	{
		String query = "insert into categorys values(?,?,?)";
		
		int count=0;
		PreparedStatement pstmt = null;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, categorys.getId());
			pstmt.setString(2, categorys.getCategoryName());
			pstmt.setString(3,categorys.getThumbnails());
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
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return count;
	}
}
