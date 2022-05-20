package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.OrderItems;

public class OrderItemsRepository {
	public static List<OrderItems> getAll(Connection con) {

		System.out.println("-----------getAllOrderItems------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<OrderItems> OrderItemsList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from order_items");
			
			if(rs!=null) {
				while(rs.next())  {
					OrderItems room = createObject(rs);
					OrderItemsList.add(room);
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
		return OrderItemsList;
	}
	
	public static OrderItems findById(Connection con, int order_id) {

		System.out.println("-----------findOrderItemsById OrderItemsorder_id: "+order_id);

		ResultSet rs = null;
		OrderItems room = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from order_items where order_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, order_id);
			rs = pStatement.executeQuery();
//			next() will moves the cursor into next row 
			if(rs!=null) {
				while(rs.next())  {
					room = createObject(rs);
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
		return room;
	}
//	order_items ( order_id, product_id, quantity )
	public static void create(Connection con, OrderItems room) {
		
		System.out.println("-----------createOrderItems------------");
		
		PreparedStatement pStatement = null;
//		order_id, annual_salary, employee_order_id
		try{  
			
			String query = 	  "INSERT INTO order_items(order_id, product_id,quantity) "
							+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getOrder_id());
			pStatement.setInt(2, room.getProduct_id());
			pStatement.setInt(3, room.getQuantity());
			
//			pStatement.setDate(5, Date.valueOf(room.getDob()));
//			pStatement.setBoolean(6, room.getGender());
			
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
	/*
	 *  order_id employee_order_id annual_salary
	 */
	
	public static void update(Connection con, OrderItems room) {
		
		System.out.println("-----------updateOrderItems------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update order_items  set quantity =?, product_id = ?"
							+ " where order_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(3, room.getOrder_id());
			pStatement.setInt(2, room.getProduct_id());
			pStatement.setInt(1, room.getQuantity());
			
			
			
//			order_id	employee_order_id	annual_salary
//			pStatement.setBoolean(6, room.getGender());
	
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

		System.out.println("-----------deleteOrderItemsById OrderItemsorder_id: "+order_id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from order_items where order_id=?";
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

	private static OrderItems createObject(ResultSet rs) throws SQLException {
		OrderItems room = new OrderItems();
		room.setOrder_id(rs.getInt("order_id"));
		room.setProduct_id(rs.getInt("product_id"));
		room.setQuantity(rs.getInt("quantity"));
//		room.setDob(rs.getDate("dob").toLocalDate());
//		room.setGender(rs.getBoolean("gender"));
		return room;
	}
	
	/*
	 * public static List<OrderItems> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<OrderItems> OrderItemsList = new ArrayList<>(); String query =
	 * " select * from room where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { OrderItems OrderItems =
	 * createObject(rs); OrderItemsList.add(OrderItems); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return OrderItemsList; }
	 * 
	 * public static List<OrderItems> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<OrderItems> OrderItemsList = new ArrayList<>(); String query =
	 * " select * from OrderItems where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { OrderItems OrderItems =
	 * createObject(rs); OrderItemsList.add(OrderItems); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return OrderItemsList; }
	 */		
}
