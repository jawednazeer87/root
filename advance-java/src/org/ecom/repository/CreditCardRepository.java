package org.ecom.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.CreditCard;

public class CreditCardRepository { //DAO Data Access Object

	public static List<CreditCard> getAllCreditCard(Connection con) {

		System.out.println("-----------getAllCreditCard------------");

		Statement stmt = null;
		ResultSet rs = null;

		List<CreditCard> CreditCardList = new ArrayList<>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(" select * from creditcard ");

			if (rs != null) {

				while (rs.next()) {

					CreditCard creditcard = new CreditCard();
					creditcard.setCc_id(rs.getInt(1));
					creditcard.setCc_num(rs.getString(2));
					creditcard.setHolder_name(rs.getString(3));
					creditcard.setExpiry_date(rs.getDate(4));
					CreditCardList.add(creditcard);
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
		return CreditCardList;
	}
	
	//find CreditCard By Cc_Id
	public static CreditCard findCreditCardByCc_Id(Connection con, long creditcardcc_Id) {

		System.out.println("-----------findCreditCardByCc_Id creditcardcc_id: " + creditcardcc_Id);

		ResultSet rs = null;
		CreditCard creditcard = null;
		PreparedStatement pStatement = null;

		try {
			String query = " select * from creditcard where cc_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, creditcardcc_Id);
			rs = pStatement.executeQuery();

			if (rs != null) {

				while (rs.next()) {
					
					 creditcard = new CreditCard();
					creditcard.setCc_id(rs.getInt(1));
					creditcard.setCc_num(rs.getString(2));
					creditcard.setHolder_name(rs.getString(3));
					creditcard.setExpiry_date(rs.getDate(4));
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
		return creditcard;
	}

	// Create method of CreditCard
	public static void createCreditCard(Connection con, CreditCard creditcard) {

		System.out.println("-----------createCreditCard------------");

		PreparedStatement pStatement = null;

		try {

			// conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlExpiry_date = new java.sql.Date(creditcard.getExpiry_date().getTime());
			

			String query = "INSERT INTO creditcard(cc_num, holder_name , expiry_date ) " 
							+ " VALUES (?,?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, creditcard.getCc_num());
			pStatement.setString(2, creditcard.getHolder_name());
			pStatement.setDate(3, sqlExpiry_date);

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
 //Update Method of CreditCard
	public static void updateCreditCard(Connection con, CreditCard creditcard) {

		System.out.println("-----------updateCreditCard------------");

		PreparedStatement pStatement = null;

		try {

			// conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlExpiry_date = new java.sql.Date(creditcard.getExpiry_date().getTime());

			String query = 	  " update creditcard set cc_num=?, holder_name=?, Expiry_date=?"
					+ " where cc_id=? ";
			
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, creditcard.getCc_num());
			pStatement.setString(2, creditcard.getHolder_name());
			pStatement.setDate(3, sqlExpiry_date);
			pStatement.setInt(4, creditcard.getCc_id());
			
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
	
	//Delete CreditCard
	public static int deleteCreditCardByCc_Id(Connection con, long creditcardcc_Id) {

		System.out.println("-----------deleteCreditCardByCc_Id creditcardcc_id: "+creditcardcc_Id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from creditcard where cc_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, creditcardcc_Id);
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
	

	public static List<CreditCard> getCreditCardByHolder_name(Connection con, String hname) {
		
		System.out.println("Holder_name: "+hname);
		List<CreditCard> creditcardList = new ArrayList<>();
		String query = " select * from creditcard where holder_name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setString(1,  "%" + hname + "%");
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				  
				CreditCard creditcard = new CreditCard();
				creditcard.setCc_id(rs.getInt(1));
				creditcard.setCc_num(rs.getString(2));
				creditcard.setHolder_name(rs.getString(3));
				creditcard.setExpiry_date(rs.getDate(4));
				creditcardList.add(creditcard);
				
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
		return creditcardList;
	
	}
}
