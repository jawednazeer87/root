package org.la.core.java.student.nizaam.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.la.core.java.student.nizaam.jdbc.model.Attendee;
import org.la.core.java.student.nizaam.jdbc.util.ConnectionUtil;

public class AttendeeRepository {
	
	private Connection connection;
	
	public void createAttendee( String firstName, String lastName, int phone, String email, boolean vip) throws Exception {
		connection = ConnectionUtil.OpenConnection();
		PreparedStatement ps = null;
		int exUpdate = 0;
		
		try {
			String query = "insert into attendee(first_name,last_name,phone,email,vip) values(?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setInt(3, phone);
			ps.setString(4, email);
			ps.setBoolean(5, vip);
			
			exUpdate = ps.executeUpdate();
			
			if(exUpdate >0) {
				System.out.println("successfully created the Attendee : "+ exUpdate);
			}
			else {
				System.out.println("failed to create the attendee : "+ exUpdate);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(ps !=null)
					ps.close();
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			connection.close();
		}
	}
	
	public Attendee findById(int attendeeId) throws Exception {
		connection = ConnectionUtil.OpenConnection();
		PreparedStatement ps = null;
		Attendee att = null;
		ResultSet rs = null;
		
		try {
			String query = "select * from attendee where attendee_id=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, attendeeId);
			rs= ps.executeQuery();
			if(rs.next()) {
				return new Attendee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getBoolean(6));
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
            try {
                if (ps != null) {
                    ps.close();
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
		
		return att;
	}

}
