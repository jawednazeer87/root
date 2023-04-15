package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Bus;


public class BusRepository {
	///get all bus
	
	public static List<Bus> getAllBus(Connection con) 
	{
		
		String query = "select * from bus";
		Statement stmt = null;
		ResultSet rs = null;
		Bus b = new Bus();
		List<Bus> list = new ArrayList<>();

		
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				b.setId(rs.getInt("id"));
				b.setRouteName(rs.getString("route_name"));
				b.setBusNum(rs.getString("bus_num"));
				b.setPlateNum(rs.getString("plate_num"));
				b.setOrigin(rs.getString("origin"));
				b.setDestination(rs.getString("destination"));
				list.add(b);
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
				System.out.println("Something Went Wrong");
			}
		}
		
		return list;
		
	}
	
	//find bus with id
	public static Bus findBusById(Connection con,int id)
	{
		Bus b = new Bus();
		String query = "select * from bus where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs= pstmt.executeQuery();
			while(rs.next())
			{
				b.setId(rs.getInt("id"));
				b.setRouteName(rs.getString("route_name"));
				b.setBusNum(rs.getString("bus_num"));
				b.setPlateNum(rs.getString("plate_num"));
				b.setOrigin(rs.getString("origin"));
				b.setDestination(rs.getString("destination"));
					
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
		
		
		return b;
		
	}
}
