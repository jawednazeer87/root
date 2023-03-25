package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.AeroplaneRouteDomestic;

public class AeroplaneRouteDomesticRepository {
	
	
	public static List<AeroplaneRouteDomestic> getAllAeroplaneRoutes(Connection con){
		String query = "select * from aeroplane_route_domestic";
		Statement stmt = null;
		ResultSet rs = null;
		List<AeroplaneRouteDomestic> list = new ArrayList<>();
		try {
			stmt=con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				AeroplaneRouteDomestic aRD = new AeroplaneRouteDomestic();
				aRD.setId(rs.getInt("id"));
				aRD.setRouteName(rs.getString("route_name"));
				aRD.setDepartureDate(rs.getDate("departure_date"));
				aRD.setArrivalDate(rs.getDate("arrival_date"));
				aRD.setDepartureCity("departure_city");
				aRD.setDepartureState("departure_state");
				aRD.setArrivalCity(rs.getString("arrival_city"));
				aRD.setCountry(rs.getString("country"));
				list.add(aRD);
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
	
	//find aeroplane route by id
	public static AeroplaneRouteDomestic getById(Connection con,int id)
	{
		String query = "select * from aeroplane_route_domestic where id = 1";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,id);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				AeroplaneRouteDomestic aeroplaneRoute = new AeroplaneRouteDomestic();
				aeroplaneRoute.setId(rs.getInt("id"));
				aeroplaneRoute.setRouteName(rs.getString("route_name"));
				aeroplaneRoute.setDepartureDate(rs.getDate("departure_data"));
				aeroplaneRoute.setArrivalDate(rs.getDate("arrival_date"));
				aeroplaneRoute.setDepartureCity(rs.getString("departure_city"));
				aeroplaneRoute.setArrivalCity(rs.getString("arrival_city"));
				aeroplaneRoute.setArrivalState(rs.getString("arrival_state"));
				aeroplaneRoute.setCountry(rs.getString("country"));
				return aeroplaneRoute;
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
			}catch(SQLException e)
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
	
	///update aeroplane route
	public static int updateAeroplaneRoute(Connection con,AeroplaneRouteDomestic aeroplaneRoute)
	{
		String query = "update aeroplane_route_domestic "
				+ "set route_name=?,departure_date=?,arrival_date=?"
				+ ",departure_city=?,departure_state=?,arrival_city=?"
				+ ",arrival_state=?,country=? where id = ?";
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, aeroplaneRoute.getRouteName());
			java.sql.Date sqlDate = new java.sql.Date(aeroplaneRoute.getDepartureDate().getTime());
			pstmt.setDate(2,sqlDate);
			sqlDate = new java.sql.Date(aeroplaneRoute.getArrivalDate().getTime());
			pstmt.setDate(3,sqlDate);
			pstmt.setString(4, aeroplaneRoute.getDepartureCity());
			pstmt.setString(5, aeroplaneRoute.getDepartureState());
			pstmt.setString(6, aeroplaneRoute.getArrivalCity());
			pstmt.setString(7, aeroplaneRoute.getArrivalState());
			pstmt.setString(8, aeroplaneRoute.getCountry());
			pstmt.setInt(9,aeroplaneRoute.getId());

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
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		return count;
	}
	
	//delete by id
	public static int deleteById(Connection con,int id)
	{
		String query = "delete from aeroplane_route_domestic where id=?";
		PreparedStatement pstmt =  null;
		int count = 0;
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
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
	
	public static List<AeroplaneRouteDomestic> getByName(Connection con,String name)
	{
		List<AeroplaneRouteDomestic> list = new ArrayList<>();
		String query  = "select * from aeroplane_route_domestic where route_name like ?";
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name+"%");
			while(rs.next())
			{
				AeroplaneRouteDomestic aeroplaneRoute = new AeroplaneRouteDomestic();
				aeroplaneRoute.setId(rs.getInt("id"));
				aeroplaneRoute.setRouteName(rs.getString("route_name"));
				aeroplaneRoute.setDepartureDate(rs.getDate("departure_date"));
				aeroplaneRoute.setArrivalDate(rs.getDate("arrival_date"));
				aeroplaneRoute.setDepartureCity(rs.getString("departure_city"));
				aeroplaneRoute.setDepartureState(rs.getString("departure_state"));
				aeroplaneRoute.setArrivalCity(rs.getString("arrival_city"));
				aeroplaneRoute.setArrivalState(rs.getString("arrival_state"));
				aeroplaneRoute.setCountry(rs.getString("country"));
				
				list.add(aeroplaneRoute);

						
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
}
