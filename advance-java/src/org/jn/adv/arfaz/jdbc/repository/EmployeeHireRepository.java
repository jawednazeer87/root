package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.EmployeeHire;

public class EmployeeHireRepository {
	public static List<EmployeeHire> getAll(Connection con) {

		System.out.println("-----------getAllEmployeeHire------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<EmployeeHire> employeeList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			
			if(rs!=null) {
				while(rs.next())  {
					EmployeeHire employee = createObject(rs);
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
	
	public static EmployeeHire findById(Connection con, int employeeId) {

		System.out.println("-----------findEmployeeHireById employeeid: "+employeeId);

		ResultSet rs = null;
		EmployeeHire employee = null;
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
	
	public static void create(Connection con, EmployeeHire employee) {
		
		System.out.println("-----------createEmployeeHire------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO employee(id, employee_name, employee_num, date_hired, city_id) "
							+ " VALUES (?, ?, ?, ?, ?)";
//			employeehire ( id, employee_name, employee_num, date_hired, city_id )
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, employee.getId());
			pStatement.setString(2, employee.getEmployee_name());
			pStatement.setInt(3, employee.getEmployee_num());
			pStatement.setDate(4, Date.valueOf(employee.getDate_hired()));
			pStatement.setInt(5, employee.getCity_id());
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
	
	public static void update(Connection con, EmployeeHire employee) {
		
		System.out.println("-----------updateEmployeeHire------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update employee set employee_name=?, employee_num=?, date_hired=?, city_id=? "
							+ " where id=? ";
//			employeehire ( id, employee_name, employee_num, date_hired, city_id )

			pStatement = con.prepareStatement(query);
			pStatement.setString(1, employee.getEmployee_name());
			pStatement.setInt(2, employee.getEmployee_num());
			pStatement.setDate(3, Date.valueOf(employee.getDate_hired()));
			pStatement.setInt(4, employee.getCity_id());
			pStatement.setInt(5, employee.getId());
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

		System.out.println("-----------deleteEmployeeHireById EmployeeHireid: "+employeeId);
		
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
//	employeehire ( id, employee_name, employee_num, date_hired, city_id )
	private static EmployeeHire createObject(ResultSet rs) throws SQLException {
		EmployeeHire employee = new EmployeeHire();
		employee.setId(rs.getInt("id"));
		employee.setEmployee_name(rs.getString("employee_name"));
		employee.setEmployee_num(rs.getInt("employee_num"));
		employee.setDate_hired(rs.getDate("date_hired").toLocalDate());
		employee.setCity_id(rs.getInt("city_id"));
		return employee;
	}
	
	public static List<EmployeeHire> getByFirstName(Connection con, String firstName) {
		
		System.out.println("firstName: "+firstName);
		
		List<EmployeeHire> employeeList = new ArrayList<>();
		String query = " select * from employee where first_name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + firstName + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				EmployeeHire employee = createObject(rs);
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
	
	public static List<EmployeeHire> getByDobRange(Connection con, LocalDate startDate, LocalDate endDate) {
		
		List<EmployeeHire> employeeList = new ArrayList<>();
		String query = " select * from employee where dob between ? and ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1, Date.valueOf(startDate));
			pStatement.setDate(2, Date.valueOf(endDate));
			
			rs = pStatement.executeQuery();
			while(rs.next())  {
				EmployeeHire employee = createObject(rs);
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
