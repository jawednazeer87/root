package org.la.core.java.student.nizaam.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	private static final String dbURL = "jdbc:mysql://localhost:3306/studentdb?serverTimezone=UTC";
	private static final String username = "root";
	private static final String password = "root";
	private static Connection connection;
	
	public static Connection OpenConnection() throws Exception{
		
		try {
			connection = DriverManager.getConnection(dbURL, username, password);
			
			if(connection != null) {
				return connection;
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception("Unable to open connection");
		}
		return null;
	}
	
	public static boolean closeConnection() {
		try {
			connection.close();
			return true;
		}
		catch(Exception e) {
			  e.printStackTrace();
		}
		return false;
	}
}
