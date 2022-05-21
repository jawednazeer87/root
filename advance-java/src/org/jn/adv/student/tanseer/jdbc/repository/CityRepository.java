package org.jn.adv.student.tanseer.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.City;

public class CityRepository 
{
	public static void create(Connection con, City city) {
		System.out.println("-----------createCityRepository------------");

		PreparedStatement pStatement = null;
		
		try{  

			String query = "INSERT INTO city(id, city)"
					+ "VALUES(?,?)";
			
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
		System.out.println("-----------Update City------------");
		
		PreparedStatement pStatement = null;
		
		try {
			 String query = "update city set city = ?"
			 		+ "where id = ?";
			 pStatement = con.prepareStatement(query);
			 pStatement.setInt(2, city.getId());
			 pStatement.setString(1, city.getCity());
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
	
	public static int deleteById(Connection con , int id) {
		System.out.println("-----------deleteCityById: "+id);
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from city where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1,id);
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
	
	public static List<City> getAll(Connection con) {

		System.out.println("-----------getAllCity------------");
		System.out.println();
		
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
	
	private static City createObject(ResultSet rs) throws SQLException {
		City city = new City();
		city.setId(rs.getInt("id"));
		city.setCity(rs.getString("city"));
		return city;
	}
}
