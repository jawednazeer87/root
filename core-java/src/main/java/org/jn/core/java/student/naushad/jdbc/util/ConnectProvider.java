package org.jn.core.java.student.naushad.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectProvider {

	public static Connection getConnect() {
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String user = "root";
		String pass = "root";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, pass);

		}  catch (ClassNotFoundException e1) {
			System.out.println("*************Problem in Connection Class*****************");
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
