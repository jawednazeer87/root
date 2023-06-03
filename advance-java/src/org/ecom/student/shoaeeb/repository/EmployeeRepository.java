package org.ecom.student.shoaeeb.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.ecom.student.shoaeeb.model.Employee;

import com.sun.tools.javac.parser.ReferenceParser.ParseException;
public class EmployeeRepository {
	//get all employee list
	public static List<Employee> getAllEmplyee(Connection con)
	{
		String query="select * from employee";
		List<Employee> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setFirstName(rs.getString(2));
				employee.setLastName(rs.getString(3));
				employee.setDob(rs.getDate(4));
				employee.setEmail(rs.getString(5));
				employee.setFatherName(rs.getString(6));
				employee.setGender(rs.getBoolean("gender"));
				employee.setCountry(rs.getString(7));
				list.add(employee);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null)
				{
					stmt.close();
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
		return list;
	}
	
	//find employee using createdDate and updatedDate
	public static List<Employee> findEmployeeByDate(Connection con,String date)
	{	
		List<Employee> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(date,":");
		String createdDate = st.nextToken();
		String updatedDate = st.nextToken();
		String query = "select * from employee where createdDate>=? and updatedDate<=?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,createdDate);
			pstmt.setString(2, updatedDate);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setFirstName(rs.getString(2));
				employee.setLastName(rs.getString(3));
				employee.setDob(rs.getDate(4));
				employee.setEmail(rs.getString(5));
				employee.setFatherName(rs.getString(6));
				employee.setCountry(rs.getString(7));
				list.add(employee);
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
		
		return list;
	}
	
	//get the details of the employee
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
				employee.setCreateDate(rs.getDate(9));
				employee.setUpdateDate(rs.getDate(10));
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
	
	public static int deleteEmployee(Connection con,int id)
	{
		//delete from employee where id=1;
		String query ="delete from employee where id=?";
		PreparedStatement pstmt = null;
		int executeUpdate = 0;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			executeUpdate = pstmt.executeUpdate();
			if(executeUpdate>0)
			{
				System.out.println("deleted succesfully");
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
				System.out.println("something went wrong in deleted method");
				e.printStackTrace();
			}
		}
		return executeUpdate;
	}
	
	public static void createEmployee(Connection con,Employee employee)
	{
		//insert into employee(firstName,lastName,dob,email,fatherName,gender,country,createdDate,updatedDate) 
		//values("Syed","Alam","2002-06-19","syed@gmail.com","Zen Alam",1,"Saudi Arab","2023-05-31","2023-05-31");

		String query = "insert into employee (firstName,lastName,dob,email,fatherName,gender,country,createdDate,updatedDate)"
				+ "values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			java.sql.Date sqlDate = new java.sql.Date(employee.getDob().getTime());
			boolean gender=false;
			long millis=System.currentTimeMillis();  
	        java.sql.Date date=new java.sql.Date(millis); 
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, employee.getFirstName());
			pstmt.setString(2,employee.getLastName());
			pstmt.setDate(3, sqlDate);
			pstmt.setString(4, employee.getEmail());
			pstmt.setString(5, employee.getFatherName());
			pstmt.setBoolean(6,employee.getGender());
			pstmt.setString(7,employee.getCountry());
			pstmt.setDate(8, date);
			pstmt.setDate(9, date);
			pstmt.executeUpdate();	
		}catch(Exception e)
		{
			System.out.println("something went wrong in createEmployee method");
			e.printStackTrace();
			//continue from here
		}
		
		
	}
	
}
