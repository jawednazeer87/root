package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Attendee;

public class AttendeeRepository {
	public static List<Attendee> getAll(Connection con) {

		System.out.println("-----------getAllAttendee------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Attendee> AttendeeList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from attendee_details");
			
			if(rs!=null) {
				while(rs.next())  {
					Attendee attendee = createObject(rs);
					AttendeeList.add(attendee);
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
		return AttendeeList;
	}
	
	public static Attendee findById(Connection con, int attendeeId) {

		System.out.println("-----------findAttendeeById Attendeeid: "+attendeeId);

		ResultSet rs = null;
		Attendee attendee = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from attendee_details where attendee_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, attendeeId);
			rs = pStatement.executeQuery();
//			next() will moves the cursor into next row 
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
			
			String query = 	  "INSERT INTO attendee_details(attendee_id, first_name,last_name,phone,email,vip) "
							+ " VALUES (?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendee.getAttendee_id());
			pStatement.setString(2, attendee.getFirst_name());
			pStatement.setString(3, attendee.getLast_name());
			pStatement.setString(4, attendee.getPhone());
			pStatement.setString(5, attendee.getEmail());
			pStatement.setBoolean(6, attendee.getVip());
//			pStatement.setDate(5, Date.valueOf(attendee.getDob()));
//			pStatement.setBoolean(6, attendee.getGender());
			
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
			
			String query = 	  " update attendee_details set first_name=?, last_name = ?, phone=?, email=?, vip=?"
							+ " where attendee_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, attendee.getFirst_name());
			pStatement.setString(2, attendee.getLast_name());
			pStatement.setString(3,attendee.getPhone());
			pStatement.setString(4,attendee.getEmail());
			pStatement.setBoolean(5,attendee.getVip());
			pStatement.setInt(6, attendee.getAttendee_id());
			
			
//			pStatement.setDate(5, Date.valueOf(attendee.getDob()));
//			pStatement.setBoolean(6, attendee.getGender());
	
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

	public static int deleteById(Connection con, int attendeeId) {

		System.out.println("-----------deleteAttendeeById Attendeeid: "+attendeeId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from attendee_details where attendee_id=?";
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
		
		return executeUpdate;
	}

	private static Attendee createObject(ResultSet rs) throws SQLException {
		Attendee attendee = new Attendee();
		attendee.setAttendee_id(rs.getInt("attendee_id"));
		attendee.setFirst_name(rs.getString("first_name"));
		attendee.setLast_name(rs.getString("last_name"));
		attendee.setPhone(rs.getString("phone"));
		attendee.setEmail(rs.getString("email"));
		attendee.setVip(rs.getBoolean("vip"));
//		attendee.setDob(rs.getDate("dob").toLocalDate());
//		attendee.setGender(rs.getBoolean("gender"));
		return attendee;
	}
	
	/*
	 * public static List<Attendee> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Attendee> AttendeeList = new ArrayList<>(); String query =
	 * " select * from attendee where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Attendee Attendee =
	 * createObject(rs); AttendeeList.add(Attendee); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return AttendeeList; }
	 * 
	 * public static List<Attendee> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Attendee> AttendeeList = new ArrayList<>(); String query =
	 * " select * from Attendee where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Attendee Attendee =
	 * createObject(rs); AttendeeList.add(Attendee); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return AttendeeList; }
	 */		
}
