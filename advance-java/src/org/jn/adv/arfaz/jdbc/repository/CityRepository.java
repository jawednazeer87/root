package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.City;

public class CityRepository {
	public static List<City> getAll(Connection con) {

		System.out.println("-----------getAllCity------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<City> CityList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from city");
			
			if(rs!=null) {
				while(rs.next())  {
					City room = createObject(rs);
					CityList.add(room);
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
		return CityList;
	}
	
	public static City findById(Connection con, int id) {

		System.out.println("-----------findCityById Cityid: "+id);

		ResultSet rs = null;
		City room = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from city where id=? ";
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
	
	public static void create(Connection con, City room) {
		
		System.out.println("-----------createCity------------");
		
		PreparedStatement pStatement = null;
//		id, annual_salary, city
		try{  
			
			String query = 	  "INSERT INTO city(id, city) "
							+ " VALUES (?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getId());
			pStatement.setString(2, room.getCity());
			
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
	 *  id city annual_salary
	 */
	
	public static void update(Connection con, City room) {
		
		System.out.println("-----------updateCity------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update city set city=?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(2, room.getId());
			pStatement.setString(1, room.getCity());
			
			
			
//			id	city	annual_salary
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

		System.out.println("-----------deleteCityById Cityid: "+id);
		
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
		City room = new City();
		room.setId(rs.getInt("id"));
		room.setCity(rs.getString("city"));
//		room.setDob(rs.getDate("dob").toLocalDate());
//		room.setGender(rs.getBoolean("gender"));
		return room;
	}
	
	/*
	 * public static List<City> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<City> CityList = new ArrayList<>(); String query =
	 * " select * from room where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { City City =
	 * createObject(rs); CityList.add(City); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return CityList; }
	 * 
	 * public static List<City> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<City> CityList = new ArrayList<>(); String query =
	 * " select * from City where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { City City =
	 * createObject(rs); CityList.add(City); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return CityList; }
	 */		
}
