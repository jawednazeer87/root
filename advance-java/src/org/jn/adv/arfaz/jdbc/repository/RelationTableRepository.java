package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.RelationTable;

public class RelationTableRepository {
	public static List<RelationTable> getAll(Connection con) {

		System.out.println("-----------getAllRelationTable------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<RelationTable> RelationTableList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from relationaltable");
			
			if(rs!=null) {
				while(rs.next())  {
					RelationTable attendee = createObject(rs);
					RelationTableList.add(attendee);
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
		return RelationTableList;
	}
	
	public static RelationTable findById(Connection con, int attendeeId) {

		System.out.println("-----------findRelationTableById RelationTableid: "+attendeeId);

		ResultSet rs = null;
		RelationTable attendee = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from relationaltable where id=? ";
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
	
//	( id, brands_id, category_id, collection_id)
	public static void create(Connection con, RelationTable attendee) {
		
		System.out.println("-----------createRelationTable------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO relationaltable(id, brands_id, category_id, collection_id) "
							+ " VALUES (?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendee.getId());
			pStatement.setInt(2, attendee.getBrands_id());
			pStatement.setInt(3, attendee.getCategory_id());
			pStatement.setInt(4, attendee.getCollection_id());
		
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
//	( id, brands_id, category_id, collection_id)
	
	public static void update(Connection con, RelationTable attendee) {
		
		System.out.println("-----------updateRelationTable------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update relationaltable set brands_id=?, category_id = ?, collection_id=?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendee.getBrands_id());
			pStatement.setInt(2, attendee.getCategory_id());
			pStatement.setInt(3,attendee.getCollection_id());
			
			pStatement.setInt(4, attendee.getId());
			
			
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

		System.out.println("-----------deleteRelationTableById RelationTableid: "+attendeeId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from relationaltable where id=?";
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

	//	( id, brands_id, category_id, collection_id)

	private static RelationTable createObject(ResultSet rs) throws SQLException {
		RelationTable attendee = new RelationTable();
		attendee.setId(rs.getInt("id"));
		attendee.setBrands_id(rs.getInt("brands_id"));
		attendee.setCategory_id(rs.getInt("category_id"));
		attendee.setCollection_id(rs.getInt("collection_id"));
	
//		attendee.setDob(rs.getDate("dob").toLocalDate());
//		attendee.setGender(rs.getBoolean("gender"));
		return attendee;
	}
	
	/*
	 * public static List<RelationTable> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<RelationTable> RelationTableList = new ArrayList<>(); String query =
	 * " select * from attendee where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setInt(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { RelationTable RelationTable =
	 * createObject(rs); RelationTableList.add(RelationTable); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return RelationTableList; }
	 * 
	 * public static List<RelationTable> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<RelationTable> RelationTableList = new ArrayList<>(); String query =
	 * " select * from RelationTable where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { RelationTable RelationTable =
	 * createObject(rs); RelationTableList.add(RelationTable); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return RelationTableList; }
	 */		
}
