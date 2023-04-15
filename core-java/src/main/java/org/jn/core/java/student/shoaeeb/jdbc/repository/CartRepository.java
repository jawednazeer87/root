package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Cart;

public class CartRepository {
	
	
	public static List<Cart> getAllCart(Connection con)
	{
		List<Cart> list =  new ArrayList<>();
		String query = "select * from cart_details";
		Statement stmt = null;
		ResultSet rs = null;
		Cart cart =new Cart();
		try {
			stmt=con.createStatement();
			rs= stmt.executeQuery(query);
			while(rs.next())
			{
				cart.setUUID(rs.getInt("UUID"));
				cart.setState(rs.getString("state"));
				cart.setCreateDate(rs.getDate("create_date"));
				cart.setQuantity(rs.getInt("quantity"));
				list.add(cart);
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
	
	public static int updateCartById(Connection con,Cart cart)
	{
		int count=0;
		String query = "update cart_details set state=? where UUID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,cart.getState());
			pstmt.setInt(2,cart.getUUID());
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
