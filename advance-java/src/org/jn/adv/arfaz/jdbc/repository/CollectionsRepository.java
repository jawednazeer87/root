package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Collections;

public class CollectionsRepository {
	public static List<Collections> getAll(Connection con) {

		System.out.println("-----------getAllCollections------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Collections> CollectionsList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from collections");
			
			if(rs!=null) {
				while(rs.next())  {
					Collections attendee = createObject(rs);
					CollectionsList.add(attendee);
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
		return CollectionsList;
	}
	
	public static Collections findById(Connection con, int id) {

		System.out.println("-----------findCollectionsById Collectionsid: "+id);

		ResultSet rs = null;
		Collections attendee = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from collections where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, id);
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
//	 collections ( id, collection_name, thumbnails )
	public static void create(Connection con, Collections attendee) {
		
		System.out.println("-----------createCollections------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO collections(id, collection_name,thumbnails) "
							+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendee.getId());
			pStatement.setString(2, attendee.getCollection_name());
			pStatement.setString(3, attendee.getThumbnails());
			
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
//	 collections ( id, collection_name, thumbnails )
	public static void update(Connection con, Collections attendee) {
		
		System.out.println("-----------updateCollections------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update collections set collection_name=?, thumbnails = ?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, attendee.getCollection_name());
			pStatement.setString(2, attendee.getThumbnails());
			
			pStatement.setInt(3, attendee.getId());
			
			
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

	public static int deleteById(Connection con, int id) {

		System.out.println("-----------deleteCollectionsById Collectionsid: "+id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from collections where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, id);
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

	private static Collections createObject(ResultSet rs) throws SQLException {
		Collections attendee = new Collections();
		attendee.setId(rs.getInt("id"));
		attendee.setCollection_name(rs.getString("collection_name"));
		attendee.setThumbnails(rs.getString("thumbnails"));
		
//		attendee.setDob(rs.getDate("dob").toLocalDate());
//		attendee.setGender(rs.getBoolean("gender"));
		return attendee;
	}
	
	/*
	 * public static List<Collections> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Collections> CollectionsList = new ArrayList<>(); String query =
	 * " select * from attendee where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Collections Collections =
	 * createObject(rs); CollectionsList.add(Collections); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return CollectionsList; }
	 * 
	 * public static List<Collections> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Collections> CollectionsList = new ArrayList<>(); String query =
	 * " select * from Collections where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Collections Collections =
	 * createObject(rs); CollectionsList.add(Collections); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return CollectionsList; }
	 */		
}
