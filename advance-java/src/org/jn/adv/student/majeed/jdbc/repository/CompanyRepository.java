package org.jn.adv.student.majeed.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.majeed.jdbc.model.Company;

public class CompanyRepository { //DAO Data Access Object
	
	public static List<Company> getAll(Connection con) {

		System.out.println("-----------getAllCompany------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Company> companyList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from Company");
			
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
	
	public static Company findById(Connection con, int companyId) {

		System.out.println("-----------findEmployeeById employeeid: "+companyId);

		ResultSet rs = null;
		Company company = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from Company where company_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, companyId);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				while(rs.next())  {
					company = createObject(rs);
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
		return company;
	}
	
	public static void create(Connection con, Company company) {
		
		System.out.println("-----------createCompany------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO company(company_id, name, description, primary_contact_attendee_id) "
							+ " VALUES (?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, company.getId());
			pStatement.setString(2, company.getName());
			pStatement.setString(3, company.getDescription());
			pStatement.setInt(4, company.getPrimaryContactAttendeeId());
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
			
			String query = 	  " update company set company_id=?, name=?, description=?, primary_contact_attendee_id=? "
							+ " where company_id= "+company.getId();
			pStatement = con.prepareStatement(query);			
			pStatement.setInt(1, company.getId());
			pStatement.setString(2, company.getName());
			pStatement.setString(3, company.getDescription());
			pStatement.setInt(4, company.getPrimaryContactAttendeeId());			
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

	public static int deleteById(Connection con, int companyId) {

		System.out.println("-----------deleteCompanyById Companyid: "+companyId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from company where company_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, companyId);
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
	
	private static Company createObject(ResultSet rs) throws SQLException {
		Company company = new Company();
		company.setId(rs.getInt("company_id"));
		company.setName(rs.getString("name"));
		company.setDescription(rs.getString("description"));
		company.setPrimaryContactAttendeeId(rs.getInt("primary_contact_attendee_id"));
		return company;
	}	

}
