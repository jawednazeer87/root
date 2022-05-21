package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Brands;

public class BrandsRepository {
	public static List<Brands> getAll(Connection con) {

		System.out.println("-----------getAllBrands------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Brands> BrandsList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from brands");
			
			if(rs!=null) {
				while(rs.next())  {
					Brands attendee = createObject(rs);
					BrandsList.add(attendee);
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
		return BrandsList;
	}
	
	public static Brands findById(Connection con, int Id) {

		System.out.println("-----------findBrandsById Brandsid: "+Id);

		ResultSet rs = null;
		Brands attendee = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from brands where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, Id);
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
//	16. brands ( id, brand_name, thumbnails )
	public static void create(Connection con, Brands attendee) {
		
		System.out.println("-----------createBrands------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO brands(id, brand_name, thumbnails ) "
							+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendee.getId());
			pStatement.setString(2, attendee.getBrand_name());
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
	
	public static void update(Connection con, Brands attendee) {
		
		System.out.println("-----------updateBrands------------");
		
		PreparedStatement pStatement = null;
//		16. brands ( id, brand_name, thumbnails )
		try{  
			
			String query = 	  " update brands set brand_name=?, thumbnails = ?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, attendee.getBrand_name());
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
//	16. brands ( id, brand_name, thumbnails )
	public static int deleteById(Connection con, int Id) {

		System.out.println("-----------deleteBrandsById Brandsid: "+Id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from brands where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, Id);
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
//	16. brands ( id, brand_name, thumbnails )
	private static Brands createObject(ResultSet rs) throws SQLException {
		Brands attendee = new Brands();
		attendee.setId(rs.getInt("id"));
		attendee.setBrand_name(rs.getString("brand_name"));
		attendee.setThumbnails(rs.getString("thumbnails"));
		
//		attendee.setDob(rs.getDate("dob").toLocalDate());
//		attendee.setGender(rs.getBoolean("gender"));
		return attendee;
	}
	
	/*
	 * public static List<Brands> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Brands> BrandsList = new ArrayList<>(); String query =
	 * " select * from attendee where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Brands Brands =
	 * createObject(rs); BrandsList.add(Brands); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return BrandsList; }
	 * 
	 * public static List<Brands> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Brands> BrandsList = new ArrayList<>(); String query =
	 * " select * from Brands where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Brands Brands =
	 * createObject(rs); BrandsList.add(Brands); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return BrandsList; }
	 */		
}
