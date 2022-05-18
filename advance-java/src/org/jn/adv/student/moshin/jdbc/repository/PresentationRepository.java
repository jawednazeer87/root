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

import org.jn.adv.student.moshin.jdbc.model.Presentation;

public class PresentationRepository {
	
	public static List<Presentation> getAll(Connection con) {

		System.out.println("-----------getAllPresentation------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Presentation> presentationList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from presentation");
			
			if(rs!=null) {
				while(rs.next())  {
					Presentation presentation = createObject(rs);
					presentationList.add(presentation);
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
		return presentationList;
	}
	
	public static Presentation findById(Connection con, int presentation_id) {

		System.out.println("-----------findPresentationById presentationid: "+presentation_id);

		ResultSet rs = null;
		Presentation presentation = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from presentation where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, presentation_id);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				while(rs.next())  {
					presentation = createObject(rs);
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
		return presentation;
	}
	
	public static void create(Connection con, Presentation presentation) {
		
		System.out.println("-----------createPresentation------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO employee(presentation_id, booked_company_id, booked_room_id, salary, start_time, end_time) "
							+ " VALUES (?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, presentation.getPresentation_id());
			pStatement.setInt(2, presentation.getBooked_company_id());
			pStatement.setInt(3, presentation.getBooked_room_id());
			pStatement.setDate(4, Date.valueOf(presentation.getStart_time()));
			pStatement.setDate(5, Date.valueOf(presentation.getend_time()));
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
	
	public static void update(Connection con, Presentation presentation) {
		
		System.out.println("-----------updatePresentation------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update presentation set presentation_id=?, booked_company_id=?, booked_room_id=?, salary=?, start_time=?, end_time=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, presentation.getPresentation_id());
			pStatement.setInt(2, presentation.getBooked_company_id());
			pStatement.setInt(3, presentation.getBooked_room_id());
			pStatement.setDate(4, Date.valueOf(presentation.getStart_time()));
			pStatement.setDate(5, Date.valueOf(presentation.getend_time()));
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

		System.out.println("-----------deletePresentationById presentationid: "+presentation_id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from presentation where id=?";
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

	private static Presentation createObject(ResultSet rs) throws SQLException {
		Presentation presentation = new Presentation();
		presentation.setPresentation_id(rs.getInt("presentation_id"));
		presentation.setBooked_company_id(rs.getInt("Booked_company_id"));
		presentation.setBooked_room_id(rs.getInt("Booked_room_id"));
		presentation.setStart_time(rs.getDate("Start_time").toLocalDate());
		presentation.setEnd_time(rs.getDate("End_time").toLocalDate());
		return presentation;
	}
	
	public static List<Presentation> getByFirstName(Connection con, String firstName) {
		
		System.out.println("firstName: "+firstName);
		
		List<Presentation> presentationList = new ArrayList<>();
		String query = " select * from presentation where first_name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + firstName + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Presentation presentation = createObject(rs);
				presentationList.add(presentation);
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
		return presentationList;
	}
	
	public static List<Presentation> getByDobRange(Connection con, LocalDate startDate, LocalDate endDate) {
		
		List<Presentation> presentationList = new ArrayList<>();
		String query = " select * from presentation where dob between ? and ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1, Date.valueOf(startDate));
			pStatement.setDate(2, Date.valueOf(endDate));
			
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Presentation presentation = createObject(rs);
				presentationList.add(presentation);
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
		return presentationList;
	}

}
