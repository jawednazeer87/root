package org.jn.adv.student.majeed.jdbc.repository;

/**
* @author AbdulMajeed
*
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.majeed.jdbc.model.Company;
import org.jn.adv.student.majeed.jdbc.model.Presentation;

public class PresentationRepository { //DAO Data Access Object
	
	private static Presentation createObject(ResultSet rs) throws SQLException {
		Presentation presentation = new Presentation();
		presentation.setPresentationId(rs.getInt("presentation_id"));
		presentation.setBookedCompanyId(rs.getInt("booked_company_id"));
		presentation.setBookedRoomId(rs.getInt("booked_room_id"));
		presentation.setStartTime(rs.getTimestamp("start_time"));
		presentation.setEndTime(rs.getTimestamp("end_time"));
		return presentation;
	}	
	
	public static void create(Connection con, Presentation presentation) {
		
		System.out.println("-----------createCompany------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO presentation(presentation_id, booked_company_id, booked_room_id, start_time, end_time) "
							+ " VALUES (?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, presentation.getPresentationId());
			pStatement.setInt(2, presentation.getBookedCompanyId());
			pStatement.setInt(3, presentation.getBookedRoomId());
			pStatement.setTimestamp(4, presentation.getStartTime());
			pStatement.setTimestamp(5, presentation.getEndTime());
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
	
	public static List<Presentation> getAll(Connection con){
		
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
	
	public static Presentation findById(Connection con, int presentationId) {

		System.out.println("-----------findPresentationById presentationid: "+presentationId);

		ResultSet rs = null;
		Presentation presentation = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from presentation where presentation_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, presentationId);
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
	
	public static void update(Connection con, Presentation presentation) {
		
		System.out.println("-----------updatePresentation------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update presentation set presentation_id=?, booked_company_id=?, booked_room_id=?, start_time=?, end_time=? "
							+ " where presentation_id= "+presentation.getPresentationId();
			pStatement = con.prepareStatement(query);			
			pStatement.setInt(1, presentation.getPresentationId());
			pStatement.setInt(2, presentation.getBookedCompanyId());
			pStatement.setInt(3, presentation.getBookedRoomId());
			pStatement.setTimestamp(4, presentation.getStartTime());
			pStatement.setTimestamp(5,presentation.getEndTime());
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

	public static int deleteById(Connection con, int presentationId) {

		System.out.println("-----------deletePresentationIdById presentationId: "+presentationId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from presentation where presentation_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, presentationId);
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

}
