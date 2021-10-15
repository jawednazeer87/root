package org.ecom.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.EmployeeTwo;

	public class EmployeeTwoRepository { //DAO Data Access Object

		//static Connection con = null;
		
		public static List<EmployeeTwo> getAllEmployeeTwo(Connection con) {

			System.out.println("-----------getAllEmployeeTwo------------");

			Statement stmt = null;
			ResultSet rs = null;

			List<EmployeeTwo> EmployeeTwoList = new ArrayList<>();
			try {
				stmt = con.createStatement();
				rs = stmt.executeQuery(" select * from employeetwo ");

				if (rs != null) {

					while (rs.next()) {

						EmployeeTwo employeetwo = new EmployeeTwo();
						employeetwo.setId(rs.getInt(1));
						employeetwo.setName(rs.getString(2));
						employeetwo.setDob(rs.getDate(3));
						employeetwo.setEmail(rs.getString(4));
						employeetwo.setGender(rs.getBoolean(5));
						employeetwo.setJoined_date(rs.getDate(6));
						employeetwo.setRelease_date(rs.getDate(7));
						employeetwo.setNotice_period(rs.getInt(8));
						EmployeeTwoList.add(employeetwo);
					}

				}
			}
			 catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (stmt != null) {
						stmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return EmployeeTwoList;
		}
		
		//find By Id
		public static EmployeeTwo findEmployeeTwoById(Connection con, long employeetwoid) {

			System.out.println("-----------findEmployeeTwoById employeetwoid: " + employeetwoid);

			ResultSet rs = null;
			EmployeeTwo employeetwo = null;
			PreparedStatement pStatement = null;

			try {
				String query = " select * from employeetwo where id=? ";
				pStatement = con.prepareStatement(query);
				pStatement.setLong(1, employeetwoid);
				rs = pStatement.executeQuery();

				if (rs != null) {

					while (rs.next()) {
						
						employeetwo = new EmployeeTwo();
						employeetwo.setId(rs.getInt(1));
						employeetwo.setName(rs.getString(2));
						employeetwo.setDob(rs.getDate(3));
						employeetwo.setEmail(rs.getString(4));
						employeetwo.setGender(rs.getBoolean(5));
						employeetwo.setJoined_date(rs.getDate(6));
						employeetwo.setRelease_date(rs.getDate(7));
						employeetwo.setNotice_period(rs.getInt(8));
					}
				}
			} 
			catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (pStatement != null) {
						pStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return employeetwo;
		}

		// Create method 
		public static void createEmployeeTwo(Connection con, EmployeeTwo employeetwo) {

			System.out.println("-----------createEmployeeTwo------------");

			PreparedStatement pStatement = null;

			try {

				// conversion from java.util.Date to java.sql.Date
				java.sql.Date sqlDob = new java.sql.Date(employeetwo.getDob().getTime());
				java.sql.Date sqlJoined_date = new java.sql.Date(employeetwo.getJoined_date().getTime());
				java.sql.Date sqlRelease_date = new java.sql.Date(employeetwo.getRelease_date().getTime());
				
				String query = "INSERT INTO employeetwo( name ,dob ,email ,gender , joined_date ,release_date ,notice_period ) " 
								+ " VALUES (? ,? ,? ,? ,? ,?, ? )";
				
				pStatement = con.prepareStatement(query);
				pStatement.setString(1, employeetwo.getName());
				pStatement.setDate(2, sqlDob);
				pStatement.setString(3, employeetwo.getEmail());
				pStatement.setBoolean(4, employeetwo.getGender());
				pStatement.setDate(5, sqlJoined_date);
				pStatement.setDate(6, sqlRelease_date);
				pStatement.setInt(7, employeetwo.getNotice_period());

				int executeUpdate = pStatement.executeUpdate();

				if (executeUpdate > 0) {
					System.out.println("data created successfully: " + executeUpdate);
				} else {
					System.out.println("failed to insert data: " + executeUpdate);
				}
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				try {
					if (pStatement != null) {
						pStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	 //Update Method 
		public static void updateEmployeeTwo(Connection con, EmployeeTwo employeetwo) {

			System.out.println("-----------updateEmployeeTwo------------");

			PreparedStatement pStatement = null;

			try {

				// conversion from java.util.Date to java.sql.Date
				java.sql.Date sqlDob = new java.sql.Date(employeetwo.getDob().getTime());
				java.sql.Date sqlJoined_date = new java.sql.Date(employeetwo.getJoined_date().getTime());
				java.sql.Date sqlRelease_date = new java.sql.Date(employeetwo.getRelease_date().getTime());

				String query = 	  " update employeetwo set name=? ,dob=? ,email=? ,gender=? , joined_date=? ,release_date=? ,notice_period=?"
						+ " where id=? ";
				
				pStatement = con.prepareStatement(query);
				pStatement.setString(1, employeetwo.getName());
				pStatement.setDate(2, sqlDob);
				pStatement.setString(3, employeetwo.getEmail());
				pStatement.setBoolean(4, employeetwo.getGender());
				pStatement.setDate(5, sqlJoined_date);
				pStatement.setDate(6, sqlRelease_date);
				pStatement.setInt(7, employeetwo.getNotice_period());
				pStatement.setInt(8, employeetwo.getId());
				
				int executeUpdate = pStatement.executeUpdate();

				if (executeUpdate > 0) {
					System.out.println("data updated successfully: " + executeUpdate);
				} else {
					System.out.println("failed to insert data: " + executeUpdate);
				}
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				try {
					if (pStatement != null) {
						pStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		//Delete 
		public static int deleteEmployeeTwoById(Connection con, long employeetwoid) {

			System.out.println("-----------deleteEmployeeTwoById emplyeetwoid: "+employeetwoid);
			
			int executeUpdate = 0;
			PreparedStatement pStatement = null;
			
			try {
				String query = "delete from employeetwo where id=?";
				pStatement = con.prepareStatement(query);
				pStatement.setLong(1, employeetwoid);
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
		
		public static List<EmployeeTwo> getEmployeeTwoByName(Connection con, String employeetwoname){
			
			System.out.println("name: "+employeetwoname);
			List<EmployeeTwo> employeetwoList = new ArrayList<>();
			String query = " select * from employeetwo where name like ? "; 
						 
			ResultSet rs = null;
			try(PreparedStatement pStatement = con.prepareStatement(query)) {
				
				pStatement.setString(1,  "%" + employeetwoname + "%");
				
				rs = pStatement.executeQuery();
				
				while(rs.next())  {
					  
					EmployeeTwo employeetwo = new EmployeeTwo();
					employeetwo.setId(rs.getInt(1));
					employeetwo.setName(rs.getString(2));
					employeetwo.setDob(rs.getDate(3));
					employeetwo.setEmail(rs.getString(4));
					employeetwo.setGender(rs.getBoolean(5));
					employeetwo.setJoined_date(rs.getDate(6));
					employeetwo.setNotice_period(rs.getInt(7));
					employeetwo.setRelease_date(rs.getDate(8));
					employeetwoList.add(employeetwo);
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
			return employeetwoList;
		}
		
		public static List<EmployeeTwo> findEmployeeTwoByDob(Connection con, Date fromDobDate, Date toDobDate){
			if(con==null) {
				return null;
			}
			PreparedStatement pStatement = null;
			ResultSet rs = null;
			List<EmployeeTwo> employeetwoList = new ArrayList<>();
			try {
				String query = "SELECT * FROM employeetwo WHERE dob BETWEEN ? AND ?";
				pStatement = con.prepareStatement(query);
				pStatement.setDate(1, fromDobDate);
				pStatement.setDate(2, toDobDate);
				
				rs = pStatement.executeQuery();
				while(rs.next()) {
					
					EmployeeTwo employeetwo = new EmployeeTwo();
					employeetwo.setId(rs.getInt(1));
					employeetwo.setName(rs.getString(2));
					employeetwo.setDob(rs.getDate(3));
					employeetwo.setEmail(rs.getString(4));
					employeetwo.setGender(rs.getBoolean(5));
					employeetwo.setJoined_date(rs.getDate(6));
					employeetwo.setRelease_date(rs.getDate(7));
					employeetwo.setNotice_period(rs.getInt(8));
					employeetwoList.add(employeetwo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (pStatement != null) {
						pStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return employeetwoList;
		}
		
		public static List<EmployeeTwo> findEmployeeTwoByJoinedDate(Connection con, Date fromJoinedDate, Date toJoinedDate){
			
			if(con==null) {
				return null;
			}
			PreparedStatement pStatement = null;
			ResultSet rs = null;
			List<EmployeeTwo> employeetwoList = new ArrayList<>();
			try {
				String query = "SELECT * FROM employeetwo WHERE joined_date BETWEEN ? AND ?";
				pStatement = con.prepareStatement(query);
				pStatement.setDate(1, fromJoinedDate);
				pStatement.setDate(2, toJoinedDate);
				
				rs = pStatement.executeQuery();
				while(rs.next()) {
					EmployeeTwo employeetwo = new EmployeeTwo();
					employeetwo.setId(rs.getInt(1));
					employeetwo.setName(rs.getString(2));
					employeetwo.setDob(rs.getDate(3));
					employeetwo.setEmail(rs.getString(4));
					employeetwo.setGender(rs.getBoolean(5));
					employeetwo.setJoined_date(rs.getDate(6));
					employeetwo.setRelease_date(rs.getDate(7));
					employeetwo.setNotice_period(rs.getInt(8));
					employeetwoList.add(employeetwo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (pStatement != null) {
						pStatement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return employeetwoList;
		}
		
		public static List<EmployeeTwo> findByReleaseDate(Connection con, Date fromReleaseDate, Date toReleaseDate){
			
			if(con==null) {
				return null;
			}
			Statement stmt = null;
			ResultSet rs = null;
			
			List<EmployeeTwo> employeetwoList = new ArrayList<>();
			try {
				stmt = con.createStatement();
				rs = stmt.executeQuery("SELECT * FROM employeetwo WHERE release_date BETWEEN ? AND ?");
				while(rs.next()) {
					EmployeeTwo employeetwo = new EmployeeTwo();
					employeetwo.setId(rs.getInt(1));
					employeetwo.setName(rs.getString(2));
					employeetwo.setDob(rs.getDate(3));
					employeetwo.setEmail(rs.getString(4));
					employeetwo.setGender(rs.getBoolean(5));
					employeetwo.setJoined_date(rs.getDate(6));
					employeetwo.setRelease_date(rs.getDate(7));
					employeetwo.setNotice_period(rs.getInt(8));
					employeetwoList.add(employeetwo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (stmt != null) {
						stmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return employeetwoList;
		}
		

		public static List<EmployeeTwo> getEmployeeTwoByNoticePeriod(Connection con, int noticePeriod){
			
			System.out.println("notice_Period: "+noticePeriod);
			List<EmployeeTwo> employeetwoList = new ArrayList<>();
			String query = " select * from employeetwo where notice_period like ? "; 
						 
			ResultSet rs = null;
			try(PreparedStatement pStatement = con.prepareStatement(query)) {
				
				pStatement.setString(1,  "%" + noticePeriod + "%");
				
				rs = pStatement.executeQuery();
				
				while(rs.next())  {
					  
					EmployeeTwo employeetwo = new EmployeeTwo();
					employeetwo.setId(rs.getInt(1));
					employeetwo.setName(rs.getString(2));
					employeetwo.setDob(rs.getDate(3));
					employeetwo.setEmail(rs.getString(4));
					employeetwo.setGender(rs.getBoolean(5));
					employeetwo.setJoined_date(rs.getDate(6));
					employeetwo.setNotice_period(rs.getInt(7));
					employeetwo.setRelease_date(rs.getDate(8));
					employeetwoList.add(employeetwo);
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
			return employeetwoList;
		}
		
		public static List<EmployeeTwo> getEmployeeTwoByEmail(Connection con, String employeetwoemail){

			System.out.println("email: "+employeetwoemail);
			List<EmployeeTwo> employeetwoList = new ArrayList<>();
			String query = " select * from employeetwo where email like ? "; 
						 
			ResultSet rs = null;
			try(PreparedStatement pStatement = con.prepareStatement(query)) {
				
				pStatement.setString(1,  "%" + employeetwoemail + "%");
				
				rs = pStatement.executeQuery();
				
				while(rs.next())  {
					  
					EmployeeTwo employeetwo = new EmployeeTwo();
					employeetwo.setId(rs.getInt(1));
					employeetwo.setName(rs.getString(2));
					employeetwo.setDob(rs.getDate(3));
					employeetwo.setEmail(rs.getString(4));
					employeetwo.setGender(rs.getBoolean(5));
					employeetwo.setJoined_date(rs.getDate(6));
					employeetwo.setNotice_period(rs.getInt(7));
					employeetwo.setRelease_date(rs.getDate(8));
					employeetwoList.add(employeetwo);
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
			return employeetwoList;
		}
		
		public static List<EmployeeTwo> getEmployeeTwoByGender(Connection con,String gender){
			
			System.out.println("gender: "+gender);
			List<EmployeeTwo> employeetwoList = new ArrayList<>();
			String query = " select * from employeetwo where gender like ? "; 
						 
			ResultSet rs = null;
			try(PreparedStatement pStatement = con.prepareStatement(query)) {
				
				pStatement.setString(1,  "%" + gender + "%");
				
				rs = pStatement.executeQuery();
				
				while(rs.next())  {
					  
					EmployeeTwo employeetwo = new EmployeeTwo();
					employeetwo.setId(rs.getInt(1));
					employeetwo.setName(rs.getString(2));
					employeetwo.setDob(rs.getDate(3));
					employeetwo.setEmail(rs.getString(4));
					employeetwo.setGender(rs.getBoolean(5));
					employeetwo.setJoined_date(rs.getDate(6));
					employeetwo.setNotice_period(rs.getInt(7));
					employeetwo.setRelease_date(rs.getDate(8));
					employeetwoList.add(employeetwo);
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
			return employeetwoList;
		}
	
}
