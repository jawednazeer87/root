package org.ecom.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.Address;

public class AddressRepository {

	public static List<Address> getAllAddress(Connection con) {

		System.out.println("-----------getAllAddress------------");
		
		Statement stmt = null;
		ResultSet rs = null;

	
		List<Address> addressList = new ArrayList<>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(" select * from address ");
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					Address address = new Address();
					address.setId(rs.getInt(1));
					address.setUserId(rs.getInt(2));
					address.setStreet(rs.getString(3));
					address.setCity(rs.getString(4));
					address.setState(rs.getString(5));
					address.setCountry(rs.getString(6));
					address.setPincode(rs.getString(7));
					addressList.add(address);
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
		return addressList;
	}
	
	public static List<Address> findAddressByUserId(Connection con, long userId) {

		System.out.println("-----------findAddressByUserId userid: "+userId);

		ResultSet rs = null;
		
		
		List<Address> addressList = new ArrayList<>();
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from address where userid=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, userId);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				
				while(rs.next())  {
					Address address = new Address();
					address.setId(rs.getInt(1));
					address.setUserId(rs.getInt(2));
					address.setStreet(rs.getString(3));
					address.setCity(rs.getString(4));
					address.setState(rs.getString(5));
					address.setCountry(rs.getString(6));
					address.setPincode(rs.getString(7));
					addressList.add(address);
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
		return addressList;
	}

	public static List<Address> findAddressByEmployeeId(Connection con, long employeeId) {

		System.out.println("-----------findAddressByEmployeeId employeeid: "+employeeId);

		ResultSet rs = null;
		
		
		List<Address> addressList = new ArrayList<>();
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from address where employeeid=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, employeeId);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				
				while(rs.next())  {
					Address address = new Address();
					address.setId(rs.getInt(1));
					address.setUserId(rs.getInt(2));
					address.setStreet(rs.getString(3));
					address.setCity(rs.getString(4));
					address.setState(rs.getString(5));
					address.setCountry(rs.getString(6));
					address.setPincode(rs.getString(7));
					addressList.add(address);
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
		return addressList;
	}
}
