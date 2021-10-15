package org.ecom.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.Employeefive;

public class EmployeefiveRepository {	//DAO Data Access Object

	public static List<Employeefive> getAllEmployee(Connection con) {

		System.out.println("-----------getAllEmployee------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Employeefive> EmpList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from Employeefive");
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					Employeefive emp = new Employeefive();
					emp.setId(rs.getInt(1));
					emp.setName(rs.getString(2));
					emp.setDob(rs.getDate(3));
					emp.setEmailid(rs.getString(4));
					emp.setGender(rs.getBoolean(5));
					emp.setJoined_date(rs.getDate(6));
					emp.setNotice_period(rs.getInt(7));
					emp.setCreate_date(rs.getDate(8));
					emp.setUpdate_date(rs.getDate(9));
					emp.setRelease_date(rs.getDate(10));
		
					EmpList.add(emp);
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
		return EmpList;
	}
	
	public static Employeefive findEmpById(Connection con, long empId) {

		System.out.println("-----------findEmpById userid: "+empId);

		ResultSet rs = null;
		Employeefive emp = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from Employeefive where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, empId);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					emp = new Employeefive();
					emp.setId(rs.getInt(1));
					emp.setName(rs.getString(2));
					emp.setDob(rs.getDate(3));
					emp.setEmailid(rs.getString(4));
					emp.setGender(rs.getBoolean(5));
					emp.setJoined_date(rs.getDate(6));
					emp.setNotice_period(rs.getInt(7));
					emp.setCreate_date(rs.getDate(8));
					emp.setUpdate_date(rs.getDate(9));
					emp.setRelease_date(rs.getDate(10));
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
		return emp;
	}
	
	public static void createEmp(Connection con, Employeefive emp) {
		
		System.out.println("-----------createEmp------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlDate = new java.sql.Date(emp.getDob().getTime());
			java.sql.Date sqljoined_date = new java.sql.Date(emp.getJoined_date().getTime());
			java.sql.Date sqlCreate_date = new java.sql.Date(emp.getCreate_date().getTime());
			java.sql.Date sqlUpdate_date = new java.sql.Date(emp.getUpdate_date().getTime());
			java.sql.Date sqlRelease_date = new java.sql.Date(emp.getRelease_date().getTime());
			
			String query = 	  "INSERT INTO Employeefive(name, dob, emailid, gender,joined_date, notice_period,create_date,update_date,release_date) "
							+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, emp.getName());
			pStatement.setDate(2, sqlDate);
			pStatement.setString(3, emp.getEmailid());
			pStatement.setBoolean(4, emp.getGender());
			pStatement.setDate(5, sqljoined_date);
			pStatement.setInt(6, emp.getNotice_period());
			pStatement.setDate(7, sqlCreate_date);
			pStatement.setDate(8, sqlUpdate_date);
			pStatement.setDate(9, sqlRelease_date);
			
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
	
	public static void updateEmp(Connection con, Employeefive emp) {
		
		System.out.println("-----------updateEmp------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlDate = new java.sql.Date(emp.getDob().getTime());
			java.sql.Date sqljoined_date = new java.sql.Date(emp.getJoined_date().getTime());
			java.sql.Date sqlCreate_date = new java.sql.Date(emp.getCreate_date().getTime());
			java.sql.Date sqlUpdate_date = new java.sql.Date(emp.getUpdate_date().getTime());
			java.sql.Date sqlRelease_date = new java.sql.Date(emp.getRelease_date().getTime());
			
			String query = 	 " update Employeefive set name=?, dob=?, emailid=?, gender=?, joined_date=? ,notice_period=?,create_date=?,update_date=?,release_date=?"
					+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, emp.getName());
			pStatement.setDate(2, sqlDate);
			pStatement.setString(3, emp.getEmailid());
			pStatement.setBoolean(4, emp.getGender());
			pStatement.setDate(5, sqljoined_date);
			pStatement.setInt(6, emp.getNotice_period());
			pStatement.setDate(7, sqlCreate_date);
			pStatement.setDate(8, sqlUpdate_date);
			pStatement.setDate(9, sqlRelease_date);
			pStatement.setInt(10, emp.getId());
			
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

	public static int deleteEmpById(Connection con, long empId) {

		System.out.println("-----------deleteempById userid: "+empId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from Employeefive where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, empId);
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
	
	public static List<Employeefive> getempByName(Connection con, String name){
		
		System.out.println("name: "+name);
		List<Employeefive> empList = new ArrayList<>();
		String query = " select * from Employeefive where name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setString(1,  "%" + name + "%");
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				  
				Employeefive emp = new Employeefive();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailid(rs.getString(4));
				emp.setGender(rs.getBoolean(5));
				emp.setJoined_date(rs.getDate(6));
				emp.setNotice_period(rs.getInt(7));
				emp.setCreate_date(rs.getDate(8));
				emp.setUpdate_date(rs.getDate(9));
				emp.setRelease_date(rs.getDate(10));
				empList.add(emp);
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
		return empList;
	}
	public static List<Employeefive> getempByAge(Connection con, Date fromDobDate,Date toDobDate){
		
		System.out.println("fromDobDate: "+fromDobDate);
		System.out.println("toDobDate: "+toDobDate);
		List<Employeefive> empList = new ArrayList<>();
		String query = " select * from Employeefive where dob between  ? AND ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1,  fromDobDate );
			pStatement.setDate(2,  toDobDate );
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				  
				Employeefive emp = new Employeefive();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailid(rs.getString(4));
				emp.setGender(rs.getBoolean(5));
				emp.setJoined_date(rs.getDate(6));
				emp.setNotice_period(rs.getInt(7));
				emp.setCreate_date(rs.getDate(8));
				emp.setUpdate_date(rs.getDate(9));
				emp.setRelease_date(rs.getDate(10));
				empList.add(emp);
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
		return empList;
	}
	
public static List<Employeefive> getempByJoinedDate(Connection con, Date fromJoinedDate,Date toJoinedDate){
		
		System.out.println("fromDobDate: "+fromJoinedDate);
		System.out.println("toDobDate: "+toJoinedDate);
		List<Employeefive> empList = new ArrayList<>();
		String query = " select * from Employeefive where joined_date between  ? AND ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1,  fromJoinedDate );
			pStatement.setDate(2,  toJoinedDate );
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				  
				Employeefive emp = new Employeefive();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailid(rs.getString(4));
				emp.setGender(rs.getBoolean(5));
				emp.setJoined_date(rs.getDate(6));
				emp.setNotice_period(rs.getInt(7));
				emp.setCreate_date(rs.getDate(8));
				emp.setUpdate_date(rs.getDate(9));
				emp.setRelease_date(rs.getDate(10));
				empList.add(emp);
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
		return empList;
	}
public static List<Employeefive> getempByReleaseDate(Connection con, Date fromReleaseDate,Date toReleaseDate){
	
	System.out.println("fromDobDate: "+fromReleaseDate);
	System.out.println("toDobDate: "+toReleaseDate);
	List<Employeefive> empList = new ArrayList<>();
	String query = " select * from Employeefive where release_date between  ? AND ? "; 
				 
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		pStatement.setDate(1,  fromReleaseDate );
		pStatement.setDate(2,  toReleaseDate );
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			Employeefive emp = new Employeefive();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setDob(rs.getDate(3));
			emp.setEmailid(rs.getString(4));
			emp.setGender(rs.getBoolean(5));
			emp.setJoined_date(rs.getDate(6));
			emp.setNotice_period(rs.getInt(7));
			emp.setCreate_date(rs.getDate(8));
			emp.setUpdate_date(rs.getDate(9));
			emp.setRelease_date(rs.getDate(10));
			empList.add(emp);
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
	return empList;
}

public static List<Employeefive> getempByEmailId(Connection con, String emailid){
	
	System.out.println("emailid: "+emailid);
	List<Employeefive> empList = new ArrayList<>();
	String query = " select * from Employeefive where emailid like ? "; 
				 
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		pStatement.setString(1,  "%" + emailid + "%");
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			Employeefive emp = new Employeefive();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setDob(rs.getDate(3));
			emp.setEmailid(rs.getString(4));
			emp.setGender(rs.getBoolean(5));
			emp.setJoined_date(rs.getDate(6));
			emp.setNotice_period(rs.getInt(7));
			emp.setCreate_date(rs.getDate(8));
			emp.setUpdate_date(rs.getDate(9));
			emp.setRelease_date(rs.getDate(10));
			empList.add(emp);
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
	return empList;
}
public static List<Employeefive> getempByNoticePeriod(Connection con, int noticePeriod){
	
	System.out.println("noticePeriod: "+noticePeriod);
	List<Employeefive> empList = new ArrayList<>();
	String query = " select * from Employeefive where notice_period like ? "; 
				 
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		pStatement.setString(1,  "%" + noticePeriod + "%");
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			Employeefive emp = new Employeefive();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setDob(rs.getDate(3));
			emp.setEmailid(rs.getString(4));
			emp.setGender(rs.getBoolean(5));
			emp.setJoined_date(rs.getDate(6));
			emp.setNotice_period(rs.getInt(7));
			emp.setCreate_date(rs.getDate(8));
			emp.setUpdate_date(rs.getDate(9));
			emp.setRelease_date(rs.getDate(10));
			empList.add(emp);
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
	return empList;
}

public static List<Employeefive> getempByGender(Connection con,String gender){
	
	System.out.println("gender: "+gender);
	List<Employeefive> empList = new ArrayList<>();
	String query = " select * from Employeefive where gender like ? "; 
				 
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		pStatement.setString(1,  "%" + gender + "%");
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			Employeefive emp = new Employeefive();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setDob(rs.getDate(3));
			emp.setEmailid(rs.getString(4));
			emp.setGender(rs.getBoolean(5));
			emp.setJoined_date(rs.getDate(6));
			emp.setNotice_period(rs.getInt(7));
			emp.setCreate_date(rs.getDate(8));
			emp.setUpdate_date(rs.getDate(9));
			emp.setRelease_date(rs.getDate(10));
			empList.add(emp);
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
	return empList;
}
}
