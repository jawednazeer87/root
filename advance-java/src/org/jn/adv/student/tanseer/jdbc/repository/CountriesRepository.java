package org.jn.adv.student.tanseer.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Countries;

public class CountriesRepository {
	
	public static void create(Connection con, Countries countries) {
		System.out.println("-----------createCountryRepository------------");

		PreparedStatement pStatement = null;
		
		try{  

			String query = "INSERT INTO countries(code, name, continent_name)"
					+ "VALUES(?,?,?)";
			
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, countries.getCode());
			pStatement.setString(2, countries.getName());
			pStatement.setString(3, countries.getContinentName());
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
	
	public static void update(Connection con, Countries countries) {
		System.out.println("-----------Update Countries------------");
		
		PreparedStatement pStatement = null;
		
		try {
			 String query = "update countries set name = ?"
			 		+ "where code = ?";
			 pStatement = con.prepareStatement(query);
			 pStatement.setInt(2, countries.getCode());
			 pStatement.setString(1, countries.getName());
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
	
	public static int deleteById(Connection con , int code) {
		System.out.println("-----------deleteCountryByCode: "+code);
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from countries where code=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1,code);
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
	
	public static List<Countries> getAll(Connection con) {

		System.out.println("-----------getAllCountries------------");
		System.out.println();
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Countries> countriesList = new ArrayList<>();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from countries");

			if(rs!=null) {
				while(rs.next())  {
					Countries countries = createObject(rs);
					countriesList.add(countries);
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
		return countriesList;
	}
	
	private static Countries createObject(ResultSet rs) throws SQLException {
		Countries countries = new Countries();
		countries.setCode(rs.getInt("code"));
		countries.setName(rs.getString("name"));
		countries.setContinentName(rs.getString("continent_name"));
		return countries;
	}
}
