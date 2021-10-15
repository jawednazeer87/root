package org.la.core.java.student.barry.jdbc.respository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.la.core.java.student.jdbc.model.User;
import org.la.core.java.student.jdbc.service.AddressService;
import org.la.core.java.student.jdbc.util.ConnectionUtil;

public class UserRepository { 
	
	private static Connection connection = null;
private static AddressService addressService = new AddressService();

public static List<User> findByDob(Calendar calendar) throws Exception {

    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int date = calendar.get(Calendar.DATE);
    LocalDate l1 = LocalDate.of(year, month, date);
    LocalDate now1 = LocalDate.now();
    Period diff1 = Period.between(l1, now1);
    System.out.println("age:" + diff1.getYears() + "years");
    return findByAge(diff1.getYears());
}

public static List<User> findByAge(int age) throws Exception {
    connection = ConnectionUtil.openConnection();
    PreparedStatement pStatement = null;
    ResultSet rs = null;
    List<User> userList = new ArrayList<>();

    try {
        String query = "select * from user where age >=?";
        pStatement = connection.prepareStatement(query);
        pStatement.setInt(1, age);

        rs = pStatement.executeQuery();

        while (rs.next()) {
            User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            userList.add(user);
        }
    } catch (Exception e) {
        System.out.println(e);
    } finally {
        try {
            if (pStatement != null) {
                pStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionUtil.closeConnection();
    }
    return userList;
}

public static User findById(int id)  throws Exception {
    connection = ConnectionUtil.openConnection();
    PreparedStatement pStatement = null;
    ResultSet rs = null;
    User user = null;
    try {
        String query = "select * FROM user WHERE id=?";
        pStatement = connection.prepareStatement(query);
        pStatement.setInt(1, id);
        rs = pStatement.executeQuery();

        while (rs.next()) {
            String name = rs.getString(2);
            String email = rs.getString(3);
            int age = rs.getInt(4);
            user = new User(id, name, email, age, addressService.findByUserId(id));
        }
    } catch (SQLException se) {
        se.printStackTrace();
    } catch (Exception e) {
        System.out.println(e);
    } finally {
        try {
            if (pStatement != null) {
                pStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionUtil.closeConnection();
    }
    return user;
}

public static void delete(int id)  throws Exception {
    connection = ConnectionUtil.openConnection();
    PreparedStatement pStatement = null;

    try {
        String query = "DELETE FROM user WHERE id=?";
        pStatement = connection.prepareStatement(query);
        pStatement.setInt(1, id);
        int executeUpdate = pStatement.executeUpdate();
        if (executeUpdate > 0) {
            System.out.println("data deleted successfully: " + executeUpdate);
        } else {
            System.out.println("failed to delete: " + executeUpdate);
        }
    } catch (SQLException se) {
        se.printStackTrace();
    } catch (Exception e) {
        System.out.println(e);
    } finally {
        try {
            if (pStatement != null) {
                pStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionUtil.closeConnection();
    }
}

public static void create(String email, String name, int age)  throws Exception {
    connection = ConnectionUtil.openConnection();
    PreparedStatement pStatement = null;

    try {

        String query = "INSERT INTO user(email, name, age) VALUES (?, ?, ?)";
        pStatement = connection.prepareStatement(query);
        pStatement.setString(1, email);
        pStatement.setString(2, name);
        pStatement.setInt(3, age);
        int executeUpdate = pStatement.executeUpdate();
        if (executeUpdate > 0) {
            System.out.println("data created successfully: " + executeUpdate);
        } else {
            System.out.println("failed to insert data: " + executeUpdate);
        }
    } catch (SQLException se) {
        se.printStackTrace();
    } catch (Exception e) {
        System.out.println(e);
    } finally {
        try {
            if (pStatement != null) {
                pStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionUtil.closeConnection();
    }

}

public static List<User> findAll()  throws Exception {

    connection = ConnectionUtil.openConnection();
    PreparedStatement pStatement = null;
    ResultSet rs = null;
    List<User> userList = new ArrayList<>();

    try {
        String query = " select * from user ";
        pStatement = connection.prepareStatement(query);

        rs = pStatement.executeQuery();

        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String email = rs.getString(3);
            int age = rs.getInt(4);
            User user = new User(id, name, email, age);
            userList.add(user);
        }
    } catch (Exception e) {
        System.out.println(e);
    } finally {
        try {
            if (pStatement != null) {
                pStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionUtil.closeConnection();
    }
    return userList;
}

}
