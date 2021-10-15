package org.la.core.java.student.jdbc.respository;

import org.la.core.java.student.jdbc.model.Address;
import org.la.core.java.student.jdbc.model.User;
import org.la.core.java.student.jdbc.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressRepository {

    static Connection connection = null;

    public static List<Address> findByUserId(int userId)  throws Exception {

        connection = ConnectionUtil.openConnection();
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        List<Address> addressList = new ArrayList<>();

        try {
            String query = "select * FROM address WHERE userId=?";
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, userId);
            rs = pStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String street = rs.getString(3);
                String city = rs.getString(4);
                String state = rs.getString(5);
                String country = rs.getString(6);
                String postcode = rs.getString(7);
                Address address = new Address(id, userId, street, city, state, country, postcode);
                addressList.add(address);
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
        return addressList;
    }


    public static Address findById(int id)  throws Exception {
        connection = ConnectionUtil.openConnection();
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        Address address = null;
        try {
            String query = "select * FROM address WHERE id=?";
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, id);
            rs = pStatement.executeQuery();

            while (rs.next()) {
                int userId = rs.getInt(2);
                String street = rs.getString(3);
                String city = rs.getString(4);
                String state = rs.getString(5);
                String country = rs.getString(6);
                String postcode = rs.getString(7);
                address = new Address(id, userId, street, city, state, country, postcode);
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
        return address;
    }

}
