package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.BaseRelation;

public class BaseRelationRepository {
	
	
	public static List<BaseRelation> getAllRelation( Connection con){
		List<BaseRelation> list = new ArrayList<>();
		String query = "select * from base_relation_table";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				BaseRelation bs = new BaseRelation();
				bs.setId(rs.getInt(1));
				bs.setBrandsId(rs.getInt(2));
				bs.setCategoryId(rs.getInt(3));
				bs.setCollectionId(rs.getInt(4));
				list.add(bs);
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
				
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public static BaseRelation findBaseRelationById(Connection con,int id)
	{
		String query = "select * from base_relation_table where id=?";
		BaseRelation bs = new BaseRelation();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				bs.setId(rs.getInt(1));
				bs.setBrandsId(rs.getInt(2));
				bs.setCategoryId(rs.getInt(3));
				bs.setCollectionId(rs.getInt(4));
			
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
		return bs;
	}
	
	public static int updateTable(Connection con,BaseRelation bs)
	{
		String query = "update base_relation_table set brands_id=?,"
				+ "category_id=?,collection_id=? where id=?";
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1,bs.getBrandsId() );
			pstmt.setInt(2, bs.getCategoryId());
			pstmt.setInt(3, bs.getCollectionId());
			pstmt.setInt(4, bs.getId());
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
	public static int deleteById(Connection con,int id)
	{
		String query = "delete from base_relation_table where id=?";
		PreparedStatement pstmt = null;
		int count=0;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			count=pstmt.executeUpdate();
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
	
	
}
