package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Car;

public class CarRepository {
	
	//get all car
	public static List<Car> getAllCar(Connection con)
	{
		String query = "select * from  car";
		Statement stmt =null;
		ResultSet rs = null;
		Car car = new Car();
		List<Car> list = new ArrayList<>();

		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				car.setCarId(rs.getInt("car_id"));
				car.setModel(rs.getString("model"));
				car.setCompany(rs.getString("company"));
				car.setEngine(rs.getString("engine"));
				car.setColor(rs.getString("color"));
				car.setType(rs.getString("type"));
				list.add(car);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
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
	
	//delete car by id
	
	public static int deleteCarById(Connection con,int id)
	{
		int count=0;
		String query = "delete from car where car_id=?";
		PreparedStatement pstmt = null;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			count = pstmt.executeUpdate();
			
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
