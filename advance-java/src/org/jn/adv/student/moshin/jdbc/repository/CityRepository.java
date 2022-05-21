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

import org.jn.adv.student.moshin.jdbc.model.City;
import org.jn.adv.student.moshin.jdbc.model.Employee;

public class CityRepository {
	public static List<City> getAll(Connection con) {

		System.out.println("-----------getAllCity------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<City> cityList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from city");
			
			if(rs!=null) {
				while(rs.next())  {
					City city = createObject(rs);
					cityList.add(city);
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
		return cityList;
	}
	
	public static City findById(Connection con, int Id) {

		System.out.println("-----------findCityById id: "+Id);

		ResultSet rs = null;
		City city = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from city where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, Id);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				while(rs.next())  {
					city = createObject(rs);
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
		return city;
	}
	
	public static void create(Connection con, City city) {
		
		System.out.println("-----------createCity------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO city(id, city) "
							+ " VALUES (?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, city.getId());
			pStatement.setString(2, city.getCity());
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
	
	public static void update(Connection con, City city) {
		
		System.out.println("-----------updateCity------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update city set id=?, city=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, city.getId());
			pStatement.setString(2, city.getCity());
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

		System.out.println("-----------deleteCityById Id: "+id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from city where id=?";
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

	private static City createObject(ResultSet rs) throws SQLException {
		City city = new City();
		city.setId(rs.getInt("id"));
		city.setCity(rs.getString("city"));
		return city;
	}
	
	public static List<City> getByID(Connection con, String id) {
		
		System.out.println("id: "+id);
		
		List<City> cityList = new ArrayList<>();
		String query = " select * from city where id like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + id + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				City city = createObject(rs);
				cityList.add(city);
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
		return cityList;
	}
	
	public static List<City> getByDobRange(Connection con, LocalDate startDate, LocalDate endDate) {
		
		List<City> cityList = new ArrayList<>();
		String query = " select * from city where dob between ? and ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1, Date.valueOf(startDate));
			pStatement.setDate(2, Date.valueOf(endDate));
			
			rs = pStatement.executeQuery();
			while(rs.next())  {
				City city = createObject(rs);
				cityList.add(city);
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
		return cityList;
	}
}
