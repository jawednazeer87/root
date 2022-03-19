package org.jn.adv.waleed.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jn.adv.waleed.jdbc.model.Company;



/**
 * @author Waleed Rizq
 *
 * @date Mar 16, 2022
 */
public class CompanyRepository {
	public static List<Company> getAll(Connection con) {

		System.out.println("-----------getAllCompany------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Company> companyList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			Scanner u = new Scanner(System.in);
			System.out.println("Please enter the Table name ");
			String t = u.nextLine();
			rs = stmt.executeQuery("select * from "+ t);
	
			System.out.println(" rs is working");
			if(rs==null) {
			System.out.println(" rs is null");
			}
			
			 if (rs!=null) {
				while(rs.next())  {
					Company company = new Company();
					company.setId(rs.getInt("id"));
					company.setCompanyName(rs.getString("company_name"));
					company.setFounderName(rs.getString("founder_name"));
					company.setRegistrationNum(rs.getString("registration_num"));
					company.setYearlyTurnover(rs.getDouble("yearly_turnover"));
				companyList.add(company);
				}
			};
			
		}
			
		catch (Exception e) {System.out.println(" catch is 1");
			e.printStackTrace();
		} 
		
		finally {
			try {
				if(stmt!=null) {
					
					stmt.close();
				}
			} 
			catch (SQLException e) {System.out.println(" finall stm  close and null");
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
	
public static void create(Connection con, Company company) {
		
		System.out.println("-----------createCompany------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
			//java.sql.Date sqlDate = new java.sql.Date(employee.getDob().getTime());
			
			String query = 	  "INSERT INTO company(company_name, founder_name, registration_num, yearly_turnover) "
							+ " VALUES (?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, company.getCompanyName());
			pStatement.setString(2, company.getFounderName());
			pStatement.setString(3, company.getRegistrationNum());
			pStatement.setDouble(4, company.getYearlyTurnover());
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
	

}
