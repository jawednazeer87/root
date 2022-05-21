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

import org.jn.adv.student.moshin.jdbc.model.Countries;
import org.jn.adv.student.moshin.jdbc.model.Employee;

public class CountriesRepository {
	public static List<Countries> getAll(Connection con) {

		System.out.println("-----------getAllCountries------------");
		
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
	
	public static Countries findById(Connection con, int code) {

		System.out.println("-----------findCountriesById code: "+code);

		ResultSet rs = null;
		Countries countries = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from countries where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, code);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				while(rs.next())  {
					countries = createObject(rs);
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
		return countries;
	}
	
	public static void create(Connection con, Countries countries) {
		
		System.out.println("-----------createCountries------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO countries(code, name, continent_name) "
							+ " VALUES (?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, countries.getCode());
			pStatement.setString(2, countries.getName());
			pStatement.setString(3, countries.getContinent_name());
			
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
		
		System.out.println("-----------updateCountries------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update countries set code=?, name=?, continent_name=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, countries.getCode());
			pStatement.setString(2, countries.getName());
			pStatement.setString(3, countries.getContinent_name());
			
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

		System.out.println("-----------deleteCountriesById Code: "+code);
		
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

	private static Countries createObject(ResultSet rs) throws SQLException {
		Countries countries = new Countries();
		countries.setCode(rs.getInt("code"));
		countries.setName(rs.getString("name"));
		countries.setContinent_name(rs.getString("continent_name"));
		
		return countries;
	}
	
	public static List<Countries> getByFirstName(Connection con, String firstName) {
		
		System.out.println("firstName: "+firstName);
		
		List<Countries> countriesList = new ArrayList<>();
		String query = " select * from countries where first_name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + firstName + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Countries countries = createObject(rs);
				countriesList.add(countries);
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
		return countriesList;
	}
	
	public static List<Countries> getByDobRange(Connection con, LocalDate startDate, LocalDate endDate) {
		
		List<Countries> countriesList = new ArrayList<>();
		String query = " select * from countries where dob between ? and ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1, Date.valueOf(startDate));
			pStatement.setDate(2, Date.valueOf(endDate));
			
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Countries countries = createObject(rs);
				countriesList.add(countries);
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
		return countriesList;
	}
}
