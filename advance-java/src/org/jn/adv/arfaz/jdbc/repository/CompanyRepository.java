package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Company;

public class CompanyRepository {
	public static List<Company> getAll(Connection con) {

		System.out.println("-----------getAllCompany------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Company> CompanyList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			
			if(rs!=null) {
				while(rs.next())  {
					Company company = createObject(rs);
					CompanyList.add(company);
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
		return CompanyList;
	}
	
	public static Company findById(Connection con, int companyId) {

		System.out.println("-----------findCompanyById Companyid: "+companyId);

		ResultSet rs = null;
		Company company = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from employee where company_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, companyId);
			rs = pStatement.executeQuery();
//			next() will moves the cursor into next row 
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
			
			String query = 	  "INSERT INTO employee(company_id, name,description, primary_contact_attendee_id) "
							+ " VALUES (?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, company.getCompanyId());
			pStatement.setString(2, company.getName());
			pStatement.setString(3, company.getDescription());
			pStatement.setInt(4, company.getPrimary_contact_attendee_id());
			
//			pStatement.setDate(5, Date.valueOf(company.getDob()));
//			pStatement.setBoolean(6, company.getGender());
			
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
			
			String query = 	  " update employee set name=?, description = ?, primary_contact_attendee_id=? "
							+ " where company_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, company.getName());
			pStatement.setString(2, company.getDescription());
			pStatement.setDouble(3, company.getPrimary_contact_attendee_id());
			pStatement.setInt(4, company.getCompanyId());
			
//			pStatement.setDate(5, Date.valueOf(company.getDob()));
//			pStatement.setBoolean(6, company.getGender());
	
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
			String query = "delete from employee where company_id=?";
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
		company.setCompanyId(rs.getInt("company_id"));
		company.setName(rs.getString("name"));
		company.setDescription(rs.getString("description"));
//		company.setDob(rs.getDate("dob").toLocalDate());
//		company.setGender(rs.getBoolean("gender"));
		company.setPrimary_contact_attendee_id(rs.getInt("primary_contact_attendee_id"));
		return company;
	}
	
	/*
	 * public static List<Company> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Company> CompanyList = new ArrayList<>(); String query =
	 * " select * from company where name like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Company Company =
	 * createObject(rs); CompanyList.add(Company); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return CompanyList; }
	 * 
	 * public static List<Company> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Company> CompanyList = new ArrayList<>(); String query =
	 * " select * from Company where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Company Company =
	 * createObject(rs); CompanyList.add(Company); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return CompanyList; }
	 */		
}
