package org.jn.core.java.mirza.jdbc.util;



import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class ConnectProvider {

	public static Connection getConnect() {
		String url = "jdbc:mysql://localhost:3306/mydata";
		String username = "root";
		String password = "root";
		Connection connection = null;
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 connection = DriverManager.getConnection(url, username, password);


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

				        
				    
				    
				
	
	
				






				