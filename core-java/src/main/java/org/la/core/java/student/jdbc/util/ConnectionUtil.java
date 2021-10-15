package org.la.core.java.student.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

    private static final String dbURL = "jdbc:mysql://localhost:3306/studentdb?serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection connection;

    public static Connection openConnection() throws Exception {
        try {
            // here student is database name, root is username and password
            connection = DriverManager.getConnection(dbURL, user, password);

            if (connection != null) {
                return connection;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Unable to open connection");
        }
        return null;
    }

    public static boolean closeConnection(){
        try{
            connection.close();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
