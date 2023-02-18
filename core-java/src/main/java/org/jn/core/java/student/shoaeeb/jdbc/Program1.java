package org.jn.core.java.student.shoaeeb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/testdb";
		String userName = "root";
		String password = "root";
		String query = "create table students(eno int ,name varchar(20))";
		
		Class.forName(driverClassName);
		Connection Con  = DriverManager.getConnection(url, userName, password);
		if(Con!=null)
		{
			System.out.println("Connection established");
		}
		else {
			System.out.println("Not established");
		}
		Statement stmt = Con.createStatement();
		stmt.execute(query);
		
	}

}
