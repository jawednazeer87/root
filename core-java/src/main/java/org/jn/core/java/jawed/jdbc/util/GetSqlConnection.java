package org.jn.core.java.jawed.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetSqlConnection {

	private static Connection con = null;

	public static Connection connectionOpen() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// here studentdb is database name, root is username and password
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?serverTimezone=UTC", "root", "root");
			if (con != null) {
				System.out.println("connected with mysql successfully");
				return con;
			} 
			else {
				System.out.println("failed to connect with mysql");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		throw new RuntimeException("Didnot get connection object, terminating program");
	}
	 
	public static void connectionClose() {
		try {
			if (con != null) {
				con.close();
				System.out.println("connection close successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
