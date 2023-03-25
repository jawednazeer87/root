package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.AeroplaneRouteInternational;

public class AeroplaneRouteInternationalRepository {
	//get all aeroplaneroute
	public static List<AeroplaneRouteInternational> getAllAeroplane(Connection con)
	{
		List<AeroplaneRouteInternational> list = new ArrayList<>();
		String query = "select * from aeroplane_route_international";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt=con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				AeroplaneRouteInternational ar =  new AeroplaneRouteInternational();
				ar.setId(rs.getInt("id"));
				ar.setRouteName(rs.getString("route_name"));
				ar.setDepartureDate(rs.getDate("departure_date"));
				ar.setArrivalDate(rs.getDate("arrival_date"));
				ar.setDepartureCity(rs.getString("departure_city"));
				ar.setDepartureState(rs.getString("departure_state"));
				ar.setArrivalCity(rs.getString("arrival_city"));
				ar.setArrivalState(rs.getString("arrival_state"));
				ar.setCountry(rs.getString("country"));
				ar.setDepartureCountry(rs.getString("departure_country"));
				ar.setArrivalCountry(rs.getString("arrival_country"));
				list.add(ar);
				
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
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return list;

	}
	//find aeroplane route by id
	public static AeroplaneRouteInternational findAeroplaneRoute(Connection con,int id)
	{
		String query ="select * from aeroplane_route_international where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		AeroplaneRouteInternational ar =  new AeroplaneRouteInternational();

		try {
			pstmt=con.prepareCall(query);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				ar.setId(rs.getInt("id"));
				ar.setRouteName(rs.getString("route_name"));
				ar.setDepartureDate(rs.getDate("departure_date"));
				ar.setArrivalDate(rs.getDate("arrival_date"));
				ar.setDepartureCity(rs.getString("departure_city"));
				ar.setDepartureState(rs.getString("departure_state"));
				ar.setArrivalCity(rs.getString("arrival_city"));
				ar.setArrivalState(rs.getString("arrival_state"));
				ar.setCountry(rs.getString("country"));
				ar.setDepartureCountry(rs.getString("departure_country"));
				ar.setArrivalCountry(rs.getString("arrival_country"));
				
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
		return ar;
	}
	
	
	//update aeroplane
	public static int updateAeroplane(Connection con, AeroplaneRouteInternational aeroplane)
	{
		int count = 0;
		String query = "update aeroplane_route_international set arrival_date=?,arrival_city=?,arrival_state=?"
				+ "country=?,arrival_country=?,route_name=? where id=?";
		PreparedStatement pstmt = null;
		try {
			pstmt=con.prepareStatement(query);
			String sDate1 = "16/03/2023";
			Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			java.sql.Date sqlDate = new java.sql.Date(aeroplane.getArrivalDate().getTime());
			pstmt.setDate(1, sqlDate);
			pstmt.setString(2,aeroplane.getArrivalCity());
			pstmt.setString(3,aeroplane.getArrivalState());
			pstmt.setString(4,aeroplane.getCountry());
			pstmt.setString(5, aeroplane.getArrivalCountry());
			pstmt.setString(6, aeroplane.getRouteName());
			pstmt.setInt(7, aeroplane.getId());
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
	
	public static int deleteAeroplaneById(Connection con, int id)
	{
		String query = "delete from aeroplane_route_international where id=?";
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			pstmt=con.prepareStatement(query);
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
	
	
}
