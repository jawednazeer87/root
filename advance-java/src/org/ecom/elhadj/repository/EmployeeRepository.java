package org.ecom.elhadj.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.elhadj.model.Employee;

public class EmployeeRepository {
	
	public static List<Employee> getAllEmployee(Connection con) {

		System.out.println("-----------getAllEmployee------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Employee> employeeList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setAge(rs.getInt(3));
					employee.setSalary(rs.getString(4));

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
	
	public static Employee findEmployeeById(Connection con, long employeeId) {

		System.out.println("-----------findEmployeeById employeeid: "+employeeId);

		ResultSet rs = null;
		Employee employee = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from employee where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, employeeId);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setAge(rs.getInt(3));
					employee.setSalary(rs.getString(4));

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
		return employee;
	}
	
	public static void createEmployee(Connection con, Employee employee) {
		
		System.out.println("-----------createEmployee------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
			//java.sql.Date sqlDate = new java.sql.Date(employee.getDob().getTime());
			
			String query = 	  "INSERT INTO employee(name, age, salary) "
							+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, employee.getName());
			pStatement.setInt(2, employee.getAge());
			pStatement.setString(3, employee.getSalary());

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
	
	public static void updateEmployee(Connection con, Employee employee) {
		
		System.out.println("-----------updateEmployee------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
		//	java.sql.Date sqlDate = new java.sql.Date(employee.getDob().getTime());
			
			String query = 	  " update employee set name=?, age=? , salary=?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, employee.getName());
			pStatement.setInt(2, employee.getAge());
			pStatement.setString(3, employee.getSalary());

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

	public static int deleteEmployeeById(Connection con, long employeeId) {

		System.out.println("-----------deleteEmployeeById Employeeid: "+employeeId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from employee where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, employeeId);
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

	public static List<Employee> getEmployeeByName(Connection con, String name) {
		
		System.out.println("name: "+name);
		List<Employee> employeeList = new ArrayList<>();
		String query = " select * from employee where name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setString(1,  "%" + name + "%");
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				  
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setAge(rs.getInt(3));
				employee.setSalary(rs.getString(4));

				employeeList.add(employee);
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
		return employeeList;
	}
		

}
