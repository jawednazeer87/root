package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Categories;

public class CategoriesRepository {
	public static List<Categories> getAll(Connection con) {

		System.out.println("-----------getAllCategories------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Categories> CategoriesList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from categories");
			
			if(rs!=null) {
				while(rs.next())  {
					Categories attendee = createObject(rs);
					CategoriesList.add(attendee);
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
		return CategoriesList;
	}
	
	public static Categories findById(Connection con, int id) {

		System.out.println("-----------findCategoriesById Categoriesid: "+id);

		ResultSet rs = null;
		Categories attendee = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from categories where id=? ";
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
//	17. categorys ( id, category_name, thumbnails )
	public static void create(Connection con, Categories attendee) {
		
		System.out.println("-----------createCategories------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO categories(id, category_name, thumbnails) "
							+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, attendee.getId());
			pStatement.setString(2, attendee.getCategory_name());
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
//	categorys ( id, category_name, thumbnails )
	public static void update(Connection con, Categories attendee) {
		
		System.out.println("-----------updateCategories------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update categories set category_name=?, thumbnails = ?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, attendee.getCategory_name());
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

		System.out.println("-----------deleteCategoriesById Categoriesid: "+id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from categories where id=?";
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

//	categorys ( id, category_name, thumbnails )
	private static Categories createObject(ResultSet rs) throws SQLException {
		Categories attendee = new Categories();
		attendee.setId(rs.getInt("id"));
		attendee.setCategory_name(rs.getString("category_name"));
		attendee.setThumbnails(rs.getString("thumbnails"));
		
//		attendee.setDob(rs.getDate("dob").toLocalDate());
//		attendee.setGender(rs.getBoolean("gender"));
		return attendee;
	}
	
	/*
	 * public static List<Categories> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Categories> CategoriesList = new ArrayList<>(); String query =
	 * " select * from attendee where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Categories Categories =
	 * createObject(rs); CategoriesList.add(Categories); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return CategoriesList; }
	 * 
	 * public static List<Categories> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Categories> CategoriesList = new ArrayList<>(); String query =
	 * " select * from Categories where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Categories Categories =
	 * createObject(rs); CategoriesList.add(Categories); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return CategoriesList; }
	 */		
}
