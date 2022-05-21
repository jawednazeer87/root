package org.jn.adv.student.moshin.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.model.Presentation_attendance;

public class Presentation_attendanceRepository {
	public static List<Presentation_attendance> getAll(Connection con) {

		System.out.println("-----------getAllPresentation_attendance------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Presentation_attendance> presentation_attendanceList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			
			if(rs!=null) {
				while(rs.next())  {
					Presentation_attendance presentation_attendance = createObject(rs);
					presentation_attendanceList.add(presentation_attendance);
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
		return presentation_attendanceList;
	}
	
	public static Presentation_attendance findById(Connection con, int presentation_id) {

		System.out.println("-----------findPresentationById Presentationid: "+presentation_id);

		ResultSet rs = null;
		Presentation_attendance presentation_attendance = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from presentation_attendance where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, presentation_id);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				while(rs.next())  {
					presentation_attendance = createObject(rs);
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
		return presentation_attendance;
	}
	
	public static void create(Connection con, Presentation_attendance presentation_attendance) {
		
		System.out.println("-----------createPresentation_attendance------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO presentation_attendance(ticket_id, presentation_id, attendee_id) "
							+ " VALUES (?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, presentation_attendance.getTicket_id());
			pStatement.setInt(2, presentation_attendance.getPresentation_id());
			pStatement.setInt(3, presentation_attendance.getAttendee_id());
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
	
	public static void update(Connection con, Presentation_attendance presentation_attendance) {
		
		System.out.println("-----------updateEmployee------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update employee set company_id=?, first_name=?, last_name=?, salary=?, dob=?, gender=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, presentation_attendance.getTicket_id());
			pStatement.setInt(2, presentation_attendance.getPresentation_id());
			pStatement.setInt(3, presentation_attendance.getAttendee_id());
		
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

	public static int deleteById(Connection con, int presentation_id) {

		System.out.println("-----------deletePresentationById Presentation_id: "+presentation_id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from presentation_id where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, presentation_id);
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
		Presentation_attendance presentation_attendance = new Presentation_attendance();
		presentation_attendance.setTicket_id(rs.getInt("Ticket_id"));
		presentation_attendance.setPresentation_id(rs.getInt("Presentation_id"));
		presentation_attendance.setAttendee_id(rs.getInt("Attendee_id"));
		
		return presentation_attendance;
	}
	
	public static List<Presentation_attendance> getByPresentation_id(Connection con, Integer presentation_id) {
		
		System.out.println("presentation_id: "+presentation_id);
		
		List<Presentation_attendance> presentation_attendanceList = new ArrayList<>();
		String query = " select * from presentation_attendance where presentation_id like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + presentation_id + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Presentation_attendance presentation_attendance = createObject(rs);
				presentation_attendanceList.add(presentation_attendance);
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
		return presentation_attendanceList;
	}
	
}
