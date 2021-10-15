package org.la.core.java.student.nizaam.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.la.core.java.student.nizaam.jdbc.model.Company;
import org.la.core.java.student.nizaam.jdbc.util.ConnectionUtil;

public class CompanyRepository {
	
	private Connection connection;
	
	public void createCompany(String name, String description, int primaryContactAttendeeId) throws Exception {
		connection = ConnectionUtil.OpenConnection();
		PreparedStatement ps = null;
		int exeUpdate = 0;
		
		try {
			String query = "insert into company(name,description,primary_contact_attendee_id) values(?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, description);
			ps.setInt(3,primaryContactAttendeeId);
			
			exeUpdate = ps.executeUpdate();
			if(exeUpdate>0) {
				System.out.println("Successfully created the Company "+ exeUpdate);
			}else {
				System.out.println("Failed to create the Company"+ exeUpdate);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(ps!=null) {
					ps.close();
				}
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			connection.close();
		}
		
	}
	
	public Company findById(int companyId) throws Exception {
		connection = ConnectionUtil.OpenConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Company c=null;
		try {
			String query = "select * from company where company_id=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, companyId);
			rs = ps.executeQuery();
			if(rs.next()) {
				c = new Company(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(ps!=null) {
					ps.close();
				}
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			try {
				if(rs!=null) {
					rs.close();
				}
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			connection.close();
		}
		return c;
	}

}
