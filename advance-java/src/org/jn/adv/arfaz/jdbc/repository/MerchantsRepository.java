package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Merchants;

public class MerchantsRepository {
	public static List<Merchants> getAll(Connection con) {

		System.out.println("-----------getAllMerchants------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Merchants> MerchantsList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from merchants");
			
			if(rs!=null) {
				while(rs.next())  {
					Merchants room = createObject(rs);
					MerchantsList.add(room);
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
		return MerchantsList;
	}
	
	public static Merchants findById(Connection con, int id) {

		System.out.println("-----------findMerchantsById Merchantsid: "+id);

		ResultSet rs = null;
		Merchants room = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from merchants where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, id);
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
	
	public static void create(Connection con, Merchants room) {
		
		System.out.println("-----------createMerchants------------");
		
		PreparedStatement pStatement = null;
//		merchants ( id, merchant_name, admin_id, country_code, created_at )
		try{  
			
			String query = 	  "INSERT INTO merchants( id, merchant_name, admin_id, country_code, created_at ) "
							+ " VALUES (?, ?,?,?,?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getId());
			pStatement.setString(2, room.getMerchant_name());
			pStatement.setInt(3, room.getAdmin_id());
			pStatement.setString(4, room.getCountry_code());
			pStatement.setDate(5, Date.valueOf(room.getCreated_at()));
			

			
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
	/*
	 */
	
	public static void update(Connection con, Merchants room) {
		
		System.out.println("-----------updateMerchants------------");
		
		PreparedStatement pStatement = null;
//		merchants ( id, merchant_name, admin_id, country_code, created_at )		
		try{  
			
			String query = 	  " update merchants set merchant_name=?, admin_id=?, country_code=?, created_at=?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, room.getMerchant_name());
			pStatement.setInt(2, room.getAdmin_id());
			pStatement.setString(3, room.getCountry_code());

//			pStatement.setDate(4, Date.valueOf(room.getDate_of_birth()));

			pStatement.setDate(4, Date.valueOf(room.getCreated_at()));
			pStatement.setInt(5, room.getId());
					
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

	public static int deleteById(Connection con, int id) {

		System.out.println("-----------deleteMerchantsById Merchantsid: "+id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from merchants where id=?";
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


//	merchants ( id, merchant_name, admin_id, country_code, created_at )
	private static Merchants createObject(ResultSet rs) throws SQLException {
		Merchants room = new Merchants();
		room.setId(rs.getInt("id"));
		room.setMerchant_name(rs.getString("full_name"));
		room.setAdmin_id(rs.getInt("admin_id"));
		room.setCountry_code(rs.getString("country_code"));
//		room.setDate_of_birth(rs.getDate("date_of_birth").toLocalDate());
		room.setCreated_at(rs.getDate("created_at").toLocalDate());
		
//		room.setDob(rs.getDate("dob").toLocalDate());
//		room.setGender(rs.getBoolean("gender"));
		return room;
	}
	
	/*
	 * public static List<Merchants> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Merchants> MerchantsList = new ArrayList<>(); String query =
	 * " select * from room where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Merchants Merchants =
	 * createObject(rs); MerchantsList.add(Merchants); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return MerchantsList; }
	 * 
	 * public static List<Merchants> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Merchants> MerchantsList = new ArrayList<>(); String query =
	 * " select * from Merchants where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Merchants Merchants =
	 * createObject(rs); MerchantsList.add(Merchants); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return MerchantsList; }
	 */		
}
