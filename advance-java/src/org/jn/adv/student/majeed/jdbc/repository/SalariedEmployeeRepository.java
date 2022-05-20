package org.jn.adv.student.majeed.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.majeed.jdbc.model.SalariedEmployee;

public class SalariedEmployeeRepository //DAO Data Access Object
{
	
	private static SalariedEmployee createObject(ResultSet rs) throws SQLException {
		SalariedEmployee salariedEmployee = new SalariedEmployee();
		salariedEmployee.setId(rs.getInt("id"));
		salariedEmployee.setAnnualSalary(rs.getDouble("annual_salary"));
		salariedEmployee.setEmployeeId(rs.getInt("employee_id"));
		return salariedEmployee;
	}
	
	public static List<SalariedEmployee> getAll(Connection con) {

		System.out.println("-----------getAllSalariedEmployee------------");
		System.out.println();
		
		Statement stmt = null;
		ResultSet rs = null;

		List<SalariedEmployee> salariedEmployeeList = new ArrayList<>();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from salaried_employee");

			if(rs!=null) {
				while(rs.next())  {
					SalariedEmployee salariedEmployee = createObject(rs);
					salariedEmployeeList.add(salariedEmployee);
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
		return salariedEmployeeList;
	}

	public static SalariedEmployee findById(Connection con, int salariedEmployeeId) {

		System.out.println("-----------findSalariedEmployeeById salariedEmployeeid: "+salariedEmployeeId);
		System.out.println();
		
		ResultSet rs = null;
		SalariedEmployee salariedEmployee = null;
		PreparedStatement pStatement = null;

		try {
			String query = " select * from salaried_employee where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, salariedEmployeeId);
			rs = pStatement.executeQuery();

			if(rs!=null) {
				while(rs.next())  {
					salariedEmployee = createObject(rs);
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
		return salariedEmployee;
	}

	public static void create(Connection con, SalariedEmployee salariedEmployee) {

		System.out.println("-----------createSalariedEmployee------------");

		PreparedStatement pStatement = null;

		try{  

			String query = 	  "INSERT INTO salaried_employee(id, annual_salary, employee_id) "
					+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, salariedEmployee.getId());
			pStatement.setDouble(2, salariedEmployee.getAnnualSalary());
			pStatement.setInt(3, salariedEmployee.getEmployeeId());
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

	public static void update(Connection con, SalariedEmployee salariedEmployee) {

		System.out.println("-----------updateSalariedEmployee------------");

		PreparedStatement pStatement = null;

		try{  

			String query = 	  " update salaried_employee set id=?, annual_salary=?, employee_id=? "
					+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, salariedEmployee.getId());
			pStatement.setDouble(2, salariedEmployee.getAnnualSalary());
			pStatement.setInt(3, salariedEmployee.getEmployeeId());
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

	public static SalariedEmployee deleteById(Connection con, int salariedEmployeeId) {

		System.out.println("-----------deleteSalariedEmployeeById SalariedEmployeeid: "+salariedEmployeeId);

		int executeUpdate = 0;
		SalariedEmployee salariedEmployee = null;
		
		PreparedStatement pStatement = null;

		try {
			String query = "delete from salaried_employee where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, salariedEmployeeId);
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

		return salariedEmployee;
	}
}
	
