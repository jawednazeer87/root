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

import org.jn.adv.student.moshin.jdbc.model.Brands;
import org.jn.adv.student.moshin.jdbc.model.Countries;
import org.jn.adv.student.moshin.jdbc.model.Employee;

public class BrandsRepository {
	public static List<Brands> getAll(Connection con) {

		System.out.println("-----------getAllBrands------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Brands> brandsList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from countries");
			
			if(rs!=null) {
				while(rs.next())  {
					Brands brands = createObject(rs);
					brandsList.add(brands);
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
		return brandsList;
	}
	
	public static Brands findById(Connection con, int code) {

		System.out.println("-----------findBrandsById code: "+code);

		ResultSet rs = null;
		Brands brands = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from brands where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, code);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				while(rs.next())  {
					brands = createObject(rs);
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
		return brands;
	}
	
	public static void create(Connection con, Brands brands) {
		
		System.out.println("-----------createBrands------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO brands(code, name, thumbnails) "
							+ " VALUES (?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, brands.getId());
			pStatement.setString(2, brands.getBrand_name());
			pStatement.setString(3, brands.getThumbnails());
			
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
	
	public static void update(Connection con, Brands brands) {
		
		System.out.println("-----------updateCountries------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update brands set id=?, brand_name=?, thumbnails=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, brands.getId());
			pStatement.setString(2, brands.getBrand_name());
			pStatement.setString(3, brands.getThumbnails());
			
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

	public static int deleteById(Connection con, int code) {

		System.out.println("-----------deleteBrandsById Code: "+code);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from countries where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, code);
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

	private static Brands createObject(ResultSet rs) throws SQLException {
		Brands brands = new Brands();
		brands.setId(rs.getInt("id"));
		brands.setBrand_name(rs.getString("brand_name"));
		brands.setThumbnails(rs.getString("thumbnails"));
		
		return brands;
	}
	
	public static List<Brands> getByBrand_name(Connection con, String brand_name) {
		
		System.out.println("brand_name: "+brand_name);
		
		List<Brands> brandsList = new ArrayList<>();
		String query = " select * from brands where brand_name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + brand_name + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Brands brands = createObject(rs);
				brandsList.add(brands);
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
		return brandsList;
	}
	
	public static List<Brands> getByDobRange(Connection con, LocalDate startDate, LocalDate endDate) {
		
		List<Brands> brandsList = new ArrayList<>();
		String query = " select * from brands where dob between ? and ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1, Date.valueOf(startDate));
			pStatement.setDate(2, Date.valueOf(endDate));
			
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Brands brands = createObject(rs);
				brandsList.add(brands);
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
		return brandsList;
	}
}
