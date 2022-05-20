package org.jn.adv.student.majeed.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.majeed.jdbc.model.Attendee;

public class AttendeeRepository  //DAO Data Access Object
{
	
	private static Attendee createObject(ResultSet rs) throws SQLException {
		Attendee attendee = new Attendee();
		attendee.setAttendeeId(rs.getInt("attendee_id"));		
		attendee.setFirstName(rs.getString("first_name"));
		attendee.setLastName(rs.getString("last_name"));
		attendee.setPhone(rs.getString("phone"));
		attendee.setEmail(rs.getString("email"));
		attendee.setVip(rs.getInt("vip"));
		return attendee;
	}
	
	public static List<Attendee> getAll(Connection con) {

		System.out.println("-----------getAllAttendee------------");
		System.out.println();
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Attendee> attendeeList = new ArrayList<>();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from attendee");

			if(rs!=null) {
				while(rs.next())  {
					Attendee attendee = createObject(rs);
					attendeeList.add(attendee);
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return attendeeList;
	}

	public static Attendee findById(Connection con, int attendeeId) {

		System.out.println("-----------findAttendeeById attendeeid: "+attendeeId);
		System.out.println();
		
		ResultSet rs = null;
		Attendee attendee = null;
		PreparedStatement pStatement = null;

		try {
			String query = " select * from attendee where attendee_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, attendeeId);
			rs = pStatement.executeQuery();

			if(rs!=null) {
				while(rs.next())  {
					attendee = createObject(rs);
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return attendee;
	}

	public static void create(Connection con, Attendee attendee) {

		System.out.println("-----------createAttendee------------");

		PreparedStatement pStatement = null;

		try{  

			String query = 	  "INSERT INTO attendee(attendee_id, first_name, last_name, phone, email, vip) "
					+ " VALUES (?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendee.getAttendeeId());
			pStatement.setString(2, attendee.getFirstName());
			pStatement.setString(3, attendee.getLastName());
			pStatement.setString(4, attendee.getPhone());
			pStatement.setString(5, attendee.getEmail());
			pStatement.setInt(6, attendee.getVip());
			int executeUpdate = pStatement.executeUpdate();

			if(executeUpdate>0) {
				System.out.println("data created successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to insert data: "+executeUpdate);
			}
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(Exception e){ 
			System.out.println(e);
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void update(Connection con, Attendee attendee) {

		System.out.println("-----------updateAttendee------------");

		PreparedStatement pStatement = null;

		try{  

			String query = 	  " update attendee set attendee_id=?, first_name=?, last_name=?, phone=?, email=?, vip=? "
					+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendee.getAttendeeId());
			pStatement.setString(2, attendee.getFirstName());
			pStatement.setString(3, attendee.getLastName());
			pStatement.setString(4, attendee.getPhone());
			pStatement.setString(5, attendee.getEmail());
			pStatement.setInt(6, attendee.getVip());
			int executeUpdate = pStatement.executeUpdate();

			if(executeUpdate>0) {
				System.out.println("data updated successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to update data: "+executeUpdate);
			}
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(Exception e){ 
			System.out.println(e);
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static Attendee deleteById(Connection con, int attendeeId) {

		System.out.println("-----------deleteAttendeeById Attendeeid: "+attendeeId);

		int executeUpdate = 0;
		Attendee attendee = null;
		
		PreparedStatement pStatement = null;

		try {
			String query = "delete from attendee where attendee_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendeeId);
			executeUpdate = pStatement.executeUpdate();

			if(executeUpdate>0) {
				System.out.println("data deleted successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to delete data: "+executeUpdate);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}

//		return executeUpdate;
		return attendee;
	}

	public static List<Attendee> getByFirstName(Connection con, String firstName) {

		System.out.println("firstName: "+firstName);

		List<Attendee> attendeeList = new ArrayList<>();
		String query = " select * from attendee where first_name like ? "; 

		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + firstName + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Attendee attendee = createObject(rs);
				attendeeList.add(attendee);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return attendeeList;
	}
}
	
