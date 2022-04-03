package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Presentation_attendance;

public class Presentation_attendanceRepository {
	public static List<Presentation_attendance> getAll(Connection con) {

		System.out.println("-----------getAllPresentation_attendance------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Presentation_attendance> Presentation_attendanceList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from presentation_attendance ");
			
			if(rs!=null) {
				while(rs.next())  {
					Presentation_attendance room = createObject(rs);
					Presentation_attendanceList.add(room);
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
		return Presentation_attendanceList;
	}
	
	public static Presentation_attendance findById(Connection con, int ticket_id) {

		System.out.println("-----------findPresentation_attendanceById Presentation_attendanceid: "+ticket_id);

		ResultSet rs = null;
		Presentation_attendance room = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from presentation_attendance  where ticket_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, ticket_id);
			rs = pStatement.executeQuery();
//			next() will moves the cursor into next row 
			if(rs!=null) {
				while(rs.next())  {
					room = createObject(rs);
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
		return room;
	}
//presentation_attendance  ( ticket_id, presentation_id, attendee_id )
	public static void create(Connection con, Presentation_attendance room) {
		
		System.out.println("-----------createPresentation_attendance------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO presentation_attendance (ticket_id, presentation_id ,attendee_id ) "
							+ " VALUES (?, ?, ?)";
//			presentation_attendance  ( ticket_id, presentation_id, attendee_id )
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getTicket_id());
			pStatement.setInt(2, room.getPresentation_id());
			pStatement.setInt(3, room.getAttendee_id());
			
//			pStatement.setDate(5, Date.valueOf(room.getDob()));
//			pStatement.setBoolean(6, room.getGender());
			
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
	
	public static void update(Connection con, Presentation_attendance room) {
		
		System.out.println("-----------updatePresentation_attendance------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update presentation_attendance  set attendee_id=?, presentation_id = ?"
							+ " where ticket_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getAttendee_id());
			pStatement.setInt(2, room.getPresentation_id());
			pStatement.setInt(3, room.getTicket_id());
			
			
//			pStatement.setDate(5, Date.valueOf(room.getDob()));
//			pStatement.setBoolean(6, room.getGender());
	
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

	public static int deleteById(Connection con, int ticket_id) {

		System.out.println("-----------deletePresentation_attendanceById Presentation_attendanceid: "+ticket_id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from presentation_attendance  where ticket_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, ticket_id);
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

	private static Presentation_attendance createObject(ResultSet rs) throws SQLException {
		Presentation_attendance room = new Presentation_attendance();
		room.setTicket_id(rs.getInt("ticket_id"));
		room.setPresentation_id(rs.getInt("presentation_id"));
		room.setAttendee_id (rs.getInt("attendee_id"));
//		room.setDob(rs.getDate("dob").toLocalDate());
//		room.setGender(rs.getBoolean("gender"));
		return room;
	}
	
	/*
	 * public static List<Presentation_attendance> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Presentation_attendance> Presentation_attendanceList = new ArrayList<>(); String query =
	 * " select * from room where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Presentation_attendance Presentation_attendance =
	 * createObject(rs); Presentation_attendanceList.add(Presentation_attendance); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return Presentation_attendanceList; }
	 * 
	 * public static List<Presentation_attendance> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Presentation_attendance> Presentation_attendanceList = new ArrayList<>(); String query =
	 * " select * from Presentation_attendance where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Presentation_attendance Presentation_attendance =
	 * createObject(rs); Presentation_attendanceList.add(Presentation_attendance); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return Presentation_attendanceList; }
	 */		
}
