package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Products;

public class ProductsRepository {
	public static List<Products> getAll(Connection con) {

		System.out.println("-----------getAllProducts------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Products> ProductsList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from products");
			
			if(rs!=null) {
				while(rs.next())  {
					Products room = createObject(rs);
					ProductsList.add(room);
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
		return ProductsList;
	}
	
	public static Products findById(Connection con, int id) {

		System.out.println("-----------findProductsById Productsid: "+id);

		ResultSet rs = null;
		Products room = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from products where id=? ";
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
//	products ( id, merchant_id, name, price, status, created_at )
	public static void create(Connection con, Products room) {
		
		System.out.println("-----------createProducts------------");
		
		PreparedStatement pStatement = null;
//		products ( id, merchant_name, admin_id, country_code, created_at )
		try{  
			
			String query = 	  "INSERT INTO products(id, merchant_id, name, price, status, created_at) "
							+ " VALUES (?, ?,?,?,?,?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getId());
			pStatement.setInt(2, room.getMerchant_id());
			pStatement.setString(3, room.getName());
			pStatement.setInt(4, room.getPrice());
			pStatement.setBoolean(5, room.getStatus());

			pStatement.setDate(6, Date.valueOf(room.getCreated_at()));
			
			

			
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
	
	public static void update(Connection con, Products room) {
		
		System.out.println("-----------updateProducts------------");
		
		PreparedStatement pStatement = null;
//		products ( id, merchant_id, name, price, status, created_at )
		try{  
			
			String query = 	  " update products set merchant_id=?, name=?, price=?, status=?, created_at=?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getMerchant_id());
			pStatement.setString(2, room.getName());
			pStatement.setInt(3, room.getPrice());
			pStatement.setBoolean(4, room.getStatus());
//			pStatement.setDate(4, Date.valueOf(room.getDate_of_birth()));

			pStatement.setDate(5, Date.valueOf(room.getCreated_at()));
			pStatement.setInt(6, room.getId());
					
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

		System.out.println("-----------deleteProductsById Productsid: "+id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from products where id=?";
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


//	products ( id, merchant_id, name, price, status, created_at )
	private static Products createObject(ResultSet rs) throws SQLException {
		Products room = new Products();
		room.setId(rs.getInt("id"));
		room.setMerchant_id(rs.getInt("merchant_id"));
		room.setName(rs.getString("name"));
		room.setPrice(rs.getInt("price"));
		room.setStatus(rs.getBoolean("status"));
//		room.setDate_of_birth(rs.getDate("date_of_birth").toLocalDate());
		room.setCreated_at(rs.getDate("created_at").toLocalDate());
		
//		room.setDob(rs.getDate("dob").toLocalDate());
//		room.setGender(rs.getBoolean("gender"));
		return room;
	}
	
	/*
	 * public static List<Products> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Products> ProductsList = new ArrayList<>(); String query =
	 * " select * from room where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Products Products =
	 * createObject(rs); ProductsList.add(Products); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return ProductsList; }
	 * 
	 * public static List<Products> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Products> ProductsList = new ArrayList<>(); String query =
	 * " select * from Products where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Products Products =
	 * createObject(rs); ProductsList.add(Products); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return ProductsList; }
	 */		
}
