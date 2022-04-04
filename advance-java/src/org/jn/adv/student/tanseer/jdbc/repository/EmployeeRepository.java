package org.jn.adv.student.tanseer.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Employee;

public class EmployeeRepository 
{
	public static List<Employee> getAll(Connection con) {

		System.out.println("-----------getAllEmployee------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Employee> employeeList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			
			if(rs!=null) {
				while(rs.next())  {
					Employee employee = createObject(rs);
					employeeList.add(employee);
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
		return employeeList;
	}

	private static Employee createObject(ResultSet rs) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setCompanyId(rs.getInt("company_id"));
		employee.setFirstName(rs.getString("first_name"));
		employee.setLastName(rs.getString("last_name"));
		employee.setSalary(rs.getDouble("salary"));
		employee.setDob(rs.getDate("dob").toLocalDate());
		employee.setGender(rs.getBoolean("gender"));
		return employee;
	}
	
	public static void create(Connection con, Employee employee) {

		System.out.println("-----------createEmployee------------");

		PreparedStatement pStatement = null;

		try{  

			String query = 	  "INSERT INTO employee(company_id, first_name, last_name, salary, dob, gender) "
					+ " VALUES (?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, employee.getCompanyId());
			pStatement.setString(2, employee.getFirstName());
			pStatement.setString(3, employee.getLastName());
			pStatement.setDouble(4, employee.getSalary());
			pStatement.setDate(5, Date.valueOf(employee.getDob()));
			pStatement.setBoolean(6, employee.getGender());
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
	



	
}
