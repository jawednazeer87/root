package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.SalariedEmployee;

public class SalariedEmployeeRepository {
	public static List<SalariedEmployee> getAll(Connection con) {

		System.out.println("-----------getAllSalariedEmployee------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<SalariedEmployee> SalariedEmployeeList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from salaried_employee");
			
			if(rs!=null) {
				while(rs.next())  {
					SalariedEmployee room = createObject(rs);
					SalariedEmployeeList.add(room);
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
		return SalariedEmployeeList;
	}
	
	public static SalariedEmployee findById(Connection con, int id) {

		System.out.println("-----------findSalariedEmployeeById SalariedEmployeeid: "+id);

		ResultSet rs = null;
		SalariedEmployee room = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from salaried_employee where id=? ";
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
	
	public static void create(Connection con, SalariedEmployee room) {
		
		System.out.println("-----------createSalariedEmployee------------");
		
		PreparedStatement pStatement = null;
//		id, annual_salary, employee_id
		try{  
			
			String query = 	  "INSERT INTO salaried_employee(id, employee_id,annual_salary) "
							+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getId());
			pStatement.setInt(2, room.getEmployee_id());
			pStatement.setInt(3, room.getAnnual_salary());
			
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
	 *  id employee_id annual_salary
	 */
	
	public static void update(Connection con, SalariedEmployee room) {
		
		System.out.println("-----------updateSalariedEmployee------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update salaried_employee set employee_id=?, annual_salary = ?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(3, room.getId());
			pStatement.setInt(1, room.getEmployee_id());
			pStatement.setInt(2, room.getAnnual_salary());
			
			
			
//			id	employee_id	annual_salary
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

		System.out.println("-----------deleteSalariedEmployeeById SalariedEmployeeid: "+id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from salaried_employee where id=?";
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

	private static SalariedEmployee createObject(ResultSet rs) throws SQLException {
		SalariedEmployee room = new SalariedEmployee();
		room.setId(rs.getInt("id"));
		room.setEmployee_id(rs.getInt("employee_id"));
		room.setAnnual_salary(rs.getInt("annual_salary"));
//		room.setDob(rs.getDate("dob").toLocalDate());
//		room.setGender(rs.getBoolean("gender"));
		return room;
	}
	
	/*
	 * public static List<SalariedEmployee> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<SalariedEmployee> SalariedEmployeeList = new ArrayList<>(); String query =
	 * " select * from room where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { SalariedEmployee SalariedEmployee =
	 * createObject(rs); SalariedEmployeeList.add(SalariedEmployee); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return SalariedEmployeeList; }
	 * 
	 * public static List<SalariedEmployee> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<SalariedEmployee> SalariedEmployeeList = new ArrayList<>(); String query =
	 * " select * from SalariedEmployee where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { SalariedEmployee SalariedEmployee =
	 * createObject(rs); SalariedEmployeeList.add(SalariedEmployee); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return SalariedEmployeeList; }
	 */		
}
