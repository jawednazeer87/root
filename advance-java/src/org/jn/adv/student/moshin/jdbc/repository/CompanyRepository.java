package org.jn.adv.student.moshin.jdbc.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import org.jn.adv.student.moshin.jdbc.model.Company;

import com.mysql.cj.xdevapi.Statement;

public class CompanyRepository {
	private static Scanner u;

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

public static Company findById(Connection con, int id) {

	System.out.println("-----------findCompanyId id: "+id);

	ResultSet rs = null;
	Company company = null;
	PreparedStatement pStatement = null;
	
	try {
		String query = " select * from company where id=? ";
		pStatement = con.prepareStatement(query);
		pStatement.setLong(1, id);
		rs = pStatement.executeQuery();
		
		if(rs!=null) {
			while(rs.next())  {
				company = new Company();
				company.setId(id);
				company.setCompanyName(rs.getString("company_name"));
				company.setFounderName(rs.getString("founder_name"));
				company.setRegistrationNum(rs.getString("registration_num"));
				company.setYearlyTurnover(rs.getDouble("yearly_turnover"));
				
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

public static void update(Connection con, Company company) {
	
	System.out.println("-----------updateCompany------------");
	
	PreparedStatement pStatement = null;
	
	try{  
		
	;
		
		String query = 	  " update company set id=?, company_name=?, founder_name=?, registration_num=?, yearly_turnover=? "
						+ " where id= 127 ";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, company.getId());
		pStatement.setString(2, company.getCompanyName());
		pStatement.setString(3, company.getFounderName());
		pStatement.setString(4, company.getRegistrationNum());
		pStatement.setDouble(5, company.getYearlyTurnover());
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

public static int deleteById(Connection con, int id) {

	System.out.println("-----------deleteCompanyById Companyid: "+id);
	
	int executeUpdate = 0;
	PreparedStatement pStatement = null;
	
	try {
		String query = "delete from company where id=?";
		pStatement = con.prepareStatement(query);
		pStatement.setInt(1, id);
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
}
