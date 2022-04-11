package org.jn.adv.student.tanseer.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Company;

public class CompanyRepository 
{
	public static void create(Connection con, Company company) {

		System.out.println("-----------createCompany------------");

		PreparedStatement pStatement = null;

		try{  

			String query = 	  "INSERT INTO company(company_id, name , description, primary_contact, attendee_id) "
					+ " VALUES (?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement .setInt(1, company.getCompanyId());
			pStatement.setString(2, company.getName());
			pStatement.setString(3, company.getDescription());
			pStatement.setInt(4, company.getPrimaryContact());
			pStatement.setInt(5, company.getAttendeeId());
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
	
	public static void update(Connection con, Company company) {

		System.out.println("-----------updateCompany------------");

		PreparedStatement pStatement = null;

		try{  

			String query = 	  " update company set company_id=?, name=?, description=?, primary_contact=?, attendee_id=? "
					+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement .setInt(1, company.getCompanyId());
			pStatement.setString(2, company.getName());
			pStatement.setString(3, company.getDescription());
			pStatement.setInt(4, company.getPrimaryContact());
			pStatement.setInt(5, company.getAttendeeId());
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
	
	public static Company deleteByName(Connection con, String name) {

		System.out.println("-----------deleteComapny CompanyName: "+name);

		int executeUpdate = 0;
		Company company = null;
		
		PreparedStatement pStatement = null;

		try {
			String query = "delete from company where name=?";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, name);
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

//		return executeUpdate;
		return company;
	}

	
	public static List<Company> getAll(Connection con) {

		System.out.println("-----------Get All Comapnay Details------------");
		System.out.println();
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Company> companyList = new ArrayList<>();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from company");

			if(rs!=null) {
				while(rs.next())  {
					Company company = createObject(rs);
					companyList.add(company);
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
		return companyList;
	}
	
	
	
	private static Company createObject(ResultSet rs) throws SQLException {
		Company company = new Company();
		company.setCompanyId(rs.getInt("company_id"));
		company.setName(rs.getString("name"));
		company.setDescription(rs.getString("description"));
		company.setPrimaryContact(rs.getInt("primary_contact"));
		company.setAttendeeId(rs.getInt("attendee_id"));
		return company;
	}

}
