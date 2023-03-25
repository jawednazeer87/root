package org.jn.core.java.student.shoaeeb.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetSqlConnection {

	public static Connection con = null;
	
	public static Connection getConnection() {
		//load the driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url  = "jdbc:mysql://localhost:3306/studentdb";
		String userName = "root";
		String passWord = "root";
		
		con = DriverManager.getConnection(url,userName,passWord);
		//System.out.println("connection established");
		return con;
		}
		catch(Exception e)
		{
			System.out.println("Failed to get Connection");
			e.printStackTrace();
		}
		return null;	
			
	}
	
	public static void closeConnection() {
		try {
			if(con!=null)
			{
				con.close();
				System.out.println("Connection closed succesfully");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
