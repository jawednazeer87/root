package org.jn.adv.student.shoaibisa.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.shoaibisa.jdbc.model.Employee;

public class EmployeeRepository {
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
	
	public static Employee findById(Connection con, int employeeId) {

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
					employee = createObject(rs);
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
			pStatement.setString(6, employee.getGender());
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
	
	public static void update(Connection con, Employee employee) {
		
		System.out.println("-----------updateEmployee------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update employee set company_id=?, first_name=?, last_name=?, salary=?, dob=?, gender=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, employee.getCompanyId());
			pStatement.setString(2, employee.getFirstName());
			pStatement.setString(3, employee.getLastName());
			pStatement.setDouble(4, employee.getSalary());
			pStatement.setDate(5, Date.valueOf(employee.getDob()));
			pStatement.setString(6, employee.getGender());
			pStatement.setInt(7, employee.getId());
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

	public static int deleteById(Connection con, int employeeId) {

		System.out.println("-----------deleteEmployeeById Employeeid: "+employeeId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from employee where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, employeeId);
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

	private static Employee createObject(ResultSet rs) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setCompanyId(rs.getInt("company_id"));
		employee.setFirstName(rs.getString("first_name"));
		employee.setLastName(rs.getString("last_name"));
		employee.setSalary(rs.getDouble("salary"));
		employee.setDob(rs.getDate("dob").toLocalDate());
		employee.setGender(rs.getString("gender"));
		return employee;
	}
	
	public static List<Employee> getByFirstName(Connection con, String firstName) {
		
		System.out.println("firstName: "+firstName);
		
		List<Employee> employeeList = new ArrayList<>();
		String query = " select * from employee where first_name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + firstName + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Employee employee = createObject(rs);
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
	
	public static List<Employee> getByDobRange(Connection con, LocalDate startDate, LocalDate endDate) {
		
		List<Employee> employeeList = new ArrayList<>();
		String query = " select * from employee where dob between ? and ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1, Date.valueOf(startDate));
			pStatement.setDate(2, Date.valueOf(endDate));
			
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Employee employee = createObject(rs);
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
