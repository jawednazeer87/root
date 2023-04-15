package org.jn.core.java.student.shoaeeb.jdbc.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.City;

public class CityRepository {
	public static List<City> getAllCity(Connection con) {
		List<City> list = new ArrayList<>();
		String query = "select * from city";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{		City c = new City();

				c.setId(rs.getInt("id"));
				c.setCity(rs.getString("city"));
				list.add(c);
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
}
