package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.HourlyEmployee;

public class HourlyEmployeeRepository {
	public static List<HourlyEmployee> getAll(Connection con) {

		System.out.println("-----------getAllHourlyEmployee------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<HourlyEmployee> HourlyEmployeeList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from hourly_employee");
			
			if(rs!=null) {
				while(rs.next())  {
					HourlyEmployee room = createObject(rs);
					HourlyEmployeeList.add(room);
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
		return HourlyEmployeeList;
	}
	
	public static HourlyEmployee findById(Connection con, int id) {

		System.out.println("-----------findHourlyEmployeeById HourlyEmployeeid: "+id);

		ResultSet rs = null;
		HourlyEmployee room = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from hourly_employee where id=? ";
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
	
	public static void create(Connection con, HourlyEmployee room) {
		
		System.out.println("-----------createHourlyEmployee------------");
		
		PreparedStatement pStatement = null;
//		hourly_employee ( id, hourly_rate, employee_id )
		try{  
			
			String query = 	  "INSERT INTO hourly_employee(id, employee_id, hourly_rate"
					+ ") "
							+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getId());
			pStatement.setInt(3, room.getHourly_rate());
			pStatement.setInt(2, room.getEmployee_id());

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
	 *  hourly_employee ( id, hourly_rate, employee_id )
	 */
	
	public static void update(Connection con, HourlyEmployee room) {
		
		System.out.println("-----------updateHourlyEmployee------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update hourly_employee set hourly_rate=?,employee_id=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getHourly_rate());
			pStatement.setInt(2, room.getEmployee_id());
			pStatement.setInt(3, room.getId());
			
			
			
//			id	hourly_employee	annual_salary
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

		System.out.println("-----------deleteHourlyEmployeeById HourlyEmployeeid: "+id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from hourly_employee where id=?";
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
//	hourly_employee ( id, hourly_rate, employee_id )
	private static HourlyEmployee createObject(ResultSet rs) throws SQLException {
		HourlyEmployee room = new HourlyEmployee();
		room.setId(rs.getInt("id"));
		room.setHourly_rate(rs.getInt("hourly_rate"));
		room.setEmployee_id(rs.getInt("employee_id"));

//		room.setDob(rs.getDate("dob").toLocalDate());
//		room.setGender(rs.getBoolean("gender"));
		return room;
	}
	
	/*
	 * public static List<HourlyEmployee> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<HourlyEmployee> HourlyEmployeeList = new ArrayList<>(); String query =
	 * " select * from room where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { HourlyEmployee HourlyEmployee =
	 * createObject(rs); HourlyEmployeeList.add(HourlyEmployee); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return HourlyEmployeeList; }
	 * 
	 * public static List<HourlyEmployee> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<HourlyEmployee> HourlyEmployeeList = new ArrayList<>(); String query =
	 * " select * from HourlyEmployee where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { HourlyEmployee HourlyEmployee =
	 * createObject(rs); HourlyEmployeeList.add(HourlyEmployee); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return HourlyEmployeeList; }
	 */		
}
