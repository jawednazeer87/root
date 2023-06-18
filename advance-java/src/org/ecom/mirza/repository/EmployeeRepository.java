package org.ecom.mirza.repository;

import java.sql.Connection;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.ArrayList;
		import java.util.List;
import java.util.StringTokenizer;

import org.ecom.mirza.model.Employee;

	public class EmployeeRepository {	//DAO Data Access Object

			public static List<Employee> getAllUser(Connection con) {

				System.out.println("-----getAllUser-----");
				
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
							employee.setFirstName(rs.getString(2));
							employee.setLastName(rs.getString(3));
							employee.setDob(rs.getDate(4));
							employee.setEmail(rs.getString(5));
							employee.setFatherName(rs.getString(6));
							employee.setGender(rs.getBoolean(7));
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
			
//			public static User findUserById(Connection con, long userId) {
//
//				System.out.println("-----------findUserById userid: "+userId);
//
		//	ResultSet rs = null;
     		//	User user = null;
		//	 PreparedStatement pStatement = null;
			public static List<Employee> findEmployeeByDate(Connection con,String date)
			{	
				List<Employee> employeelist = new ArrayList<>();
				StringTokenizer st = new StringTokenizer(date,":");
				String createdDate = st.nextToken();
				String updatedDate = st.nextToken();
				
				String query = "select * from employee where createdDate>=? and updatedDate<=?";
				
				 PreparedStatement pStatement = null;
				 ResultSet rs = null;
				 
				try {
					
					pStatement = con.prepareStatement(query);
					pStatement.setString(1, createdDate);
					pStatement.setString(2, updatedDate);

					
					rs = pStatement.executeQuery();
					if(rs!=null) {
						while(rs.next())  {
					Employee	employee = new Employee();
							employee.setId(rs.getInt(1));
							employee.setFirstName(rs.getString(2));
							employee.setLastName(rs.getString(3));
							employee.setDob(rs.getDate(4));
							employee.setEmail(rs.getString(5));
							employee.setFatherName(rs.getString(6));
							employee.setGender(rs.getBoolean(7));
							employee.setCountry(rs.getString(8));
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
				return employeelist;
			}
			
			public static void createEmlopyee(Connection con, Employee employee) {
				
				System.out.println("-----------createEmployee------------");
				
				PreparedStatement pStatement = null;
				
				try{  
					
					//conversion from java.util.Date to java.sql.Date
					java.sql.Date sqlDate = new java.sql.Date(employee.getDob().getTime());
					long millis=System.currentTimeMillis();  
			        java.sql.Date date=new java.sql.Date(millis); 
					
					String query = 	  "INSERT INTO employee(firstName, lastName, dob, email, fatherName, gender, country, createdDate, updatedDate) "
									+ " VALUES (?, ?, ?, ?, ?, ?, ?,?,?)";
					pStatement = con.prepareStatement(query);
					
					pStatement.setString(1, employee.getFirstName());
					pStatement.setString(2, employee.getLastName());
					pStatement.setDate(3, sqlDate);
					pStatement.setString(4, employee.getEmail());
					pStatement.setString(5, employee.getFatherName());
					pStatement.setBoolean(6, employee.getGender());
					pStatement.setString(7, employee.getCountry());
					pStatement.setDate(8,date);
					pStatement.setDate(9, date);

					pStatement.setString(7, employee.getCountry());

					

					
					
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
			
			@SuppressWarnings("null")
			public static void updateEmployee(Connection con, Employee employee) {
				
				System.out.println("-----------updateEmployee------------");
				
				PreparedStatement pStatement = null;
				
				try{  
					
					//conversion from java.util.Date to java.sql.Date
					java.sql.Date sqlDate = new java.sql.Date(employee.getDob().getTime());
					
					String query = 	  " update employee set firstName=?, lastName=?, dob=?, email=?, fatherName=?, gender=? "
									+ " , country=?,createdDate=?, updatedDate=? where id=? ";
            			pStatement = con.prepareStatement(query);

					
					pStatement.setString(1, employee.getFirstName());
					pStatement.setString(2, employee.getLastName());
					pStatement.setDate(3, sqlDate);
					pStatement.setString(4, employee.getEmail());
					pStatement.setString(5, employee.getFatherName());
					pStatement.setBoolean(6, employee.getGender());
					pStatement.setString(7, employee.getCountry());
					pStatement.setInt(8, employee.getId());
					pStatement.setDate(9,sqlDate);
					pStatement.setDate(10, sqlDate);

					
					
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
			
			public static Employee getEmployeeDetails(Connection con,int id)
			{
				String query = "select * from employee where id=?";
				PreparedStatement pstmt = null;
				ResultSet rs =null;
				Employee employee=null;
				try {
					pstmt=con.prepareStatement(query);
					pstmt.setInt(1, id);
					rs=pstmt.executeQuery();
					while(rs.next())
					{
						employee = new Employee();
						employee.setId(rs.getInt(1));
						employee.setFirstName(rs.getString(2));
						employee.setLastName(rs.getString(3));
						employee.setDob(rs.getDate(4));
						employee.setEmail(rs.getString(5));
						employee.setFatherName(rs.getString(6));
						employee.setGender(rs.getBoolean(7));
						employee.setCountry(rs.getString(8));
						employee.setCreatedDate(rs.getDate(9));
						employee.setUpdatedDate(rs.getDate(10));
					}
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				finally {
					try {
						if(pstmt!=null)
						{
							pstmt.close();
						}
					}catch(SQLException e)
					{
						e.printStackTrace();
					}
					try {
						if(rs!=null)
						{
							rs.close();
						}
					}catch(SQLException e)
					{
						e.printStackTrace();
					}
				}
				return employee;

			}
			public static int deleteEmployeeById(Connection con, long employeeId) {

				System.out.println("-----------deleteEmployeeById employeeid: "+employeeId);
				
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
			
			public static List<Employee> getemployeeByName(Connection con, String name){
				
				System.out.println("name: "+name);
				List<Employee> employeeList = new ArrayList<>();
				String query = " select * from employee where firstname like ? "; 
							 
				ResultSet rs = null;
				try(PreparedStatement pStatement = con.prepareStatement(query)) {
					
					pStatement.setString(1,  "%" + name + "%");
					
					rs = pStatement.executeQuery();
					
					while(rs.next())  {
						  
						Employee employee = new  Employee();
						employee.setId(rs.getInt(1));
						employee.setFirstName(rs.getString(2));
						employee.setLastName(rs.getString(3));
						employee.setDob(rs.getDate(4));
						employee.setEmail(rs.getString(5));
						employee.setFatherName(rs.getString(6));
						employee.setGender(rs.getBoolean(7));
						


						
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



