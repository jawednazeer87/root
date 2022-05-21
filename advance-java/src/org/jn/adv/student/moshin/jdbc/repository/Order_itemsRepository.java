package org.jn.adv.student.moshin.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.model.Order_items;

public class Order_itemsRepository {
	public static List<Order_items> getAll(Connection con) {

		System.out.println("-----------getAllOrder_items------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Order_items> order_itemsList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from Order_items");
			
			if(rs!=null) {
				while(rs.next())  {
					Order_items order_items = createObject(rs);
					order_itemsList.add(order_items);
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
		return order_itemsList;
	}
	
	public static Order_items findById(Connection con, int order_id) {

		System.out.println("-----------findOrderById order_id: "+order_id);

		ResultSet rs = null;
		Order_items order_items = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from order where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, order_id);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				while(rs.next())  {
					order_items = createObject(rs);
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
		return order_items;
	}
	
	public static void create(Connection con, Order_items order_items) {
		
		System.out.println("-----------createOrder_items------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO order_items(order_id, product_id, quantity) "
							+ " VALUES (?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, order_items.getOrder_id());
			pStatement.setInt(2, order_items.getProduct_id());
			pStatement.setInt(3, order_items.getQuantity());
			
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
	
	public static void update(Connection con, Order_items order_items) {
		
		System.out.println("-----------updateEmployee------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update order_items set order_id=?, product_id=?, last_name=?, salary=?, dob=?, gender=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, order_items.getOrder_id());
			pStatement.setInt(2, order_items.getProduct_id());
			pStatement.setInt(3, order_items.getQuantity());
			
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

	public static int deleteById(Connection con, int order_id) {

		System.out.println("-----------deleteOrderById Order_id: "+order_id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from order_items where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, order_id);
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

	private static Order_items createObject(ResultSet rs) throws SQLException {
		Order_items order_items = new Order_items();
		order_items.setOrder_id(rs.getInt("id"));
		order_items.setProduct_id(rs.getInt("company_id"));
		order_items.setQuantity(rs.getInt("first_name"));
		
		return order_items;
	}
	
	public static List<Order_items> getByOrder_id(Connection con, Integer order_id) {
		
		System.out.println("Order_id: "+order_id);
		
		List<Order_items> order_itemsList = new ArrayList<>();
		String query = " select * from order_items where order_id like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + order_id + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Order_items order_items = createObject(rs);
				order_itemsList.add(order_items);
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
		return order_itemsList;
	}
	
	public static List<Order_items> getByDobRange(Connection con, LocalDate startDate, LocalDate endDate) {
		
		List<Order_items> order_itemsList = new ArrayList<>();
		String query = " select * from order_items where dob between ? and ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1, Date.valueOf(startDate));
			pStatement.setDate(2, Date.valueOf(endDate));
			
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Order_items order_items = createObject(rs);
				order_itemsList.add(order_items);
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
		return order_itemsList;
	}
}
