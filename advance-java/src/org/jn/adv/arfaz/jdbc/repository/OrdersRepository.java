package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import org.jn.adv.arfaz.jdbc.model.Orders;

public class OrdersRepository {
	public static List<Orders> getAll(Connection con) {

		System.out.println("-----------getAllOrders------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Orders> OrdersList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from orders");
			
			if(rs!=null) {
				while(rs.next())  {
					Orders room = createObject(rs);
					OrdersList.add(room);
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
		return OrdersList;
	}
	
	public static Orders findById(Connection con, int order_id) {

		System.out.println("-----------findOrdersById Ordersorder_id: "+order_id);

		ResultSet rs = null;
		Orders room = null;
		PreparedStatement pStatement = null;
//		id	user_id	created_at	status
		try {
			String query = " select * from orders where id=? ";
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
	public static void create(Connection con, Orders room) {
		
		System.out.println("-----------createOrders------------");
		
		PreparedStatement pStatement = null;
//		id	user_id	created_at	status
		try{  
			
			String query = 	  "INSERT INTO orders(id, user_id,created_at,status) "
							+ " VALUES (?, ?, ?,?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getId());
			pStatement.setInt(2, room.getUser_id());
			pStatement.setDate(3, Date.valueOf(room.getCreated_at()));
			pStatement.setBoolean(4, room.isStatus());

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
orders ( id, user_id, status, created_at )	 */
	
	public static void update(Connection con, Orders room) {
		
		System.out.println("-----------updateOrders------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update orders  set user_id =?, status = ?, created_at=?"
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(4, room.getId());
			pStatement.setDate(3, Date.valueOf(room.getCreated_at()));
			pStatement.setBoolean(2, room.isStatus());
			pStatement.setInt(1, room.getUser_id());
			
			
			
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

		System.out.println("-----------deleteOrdersById Ordersorder_id: "+order_id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
//		orders ( id, user_id, status, created_at )
		try {
			String query = "delete from orders where id=?";
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
//	orders ( id, user_id, status, created_at )
	private static Orders createObject(ResultSet rs) throws SQLException {
		Orders room = new Orders();
		room.setId(rs.getInt("id"));
		room.setUser_id(rs.getInt("user_id"));
		room.setStatus(rs.getBoolean("status"));
		room.setCreated_at(rs.getDate("created_at").toLocalDate());

//		room.setDob(rs.getDate("dob").toLocalDate());
//		room.setGender(rs.getBoolean("gender"));
		return room;
	}
	
	/*
	 * public static List<Orders> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Orders> OrdersList = new ArrayList<>(); String query =
	 * " select * from room where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Orders Orders =
	 * createObject(rs); OrdersList.add(Orders); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return OrdersList; }
	 * 
	 * public static List<Orders> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Orders> OrdersList = new ArrayList<>(); String query =
	 * " select * from Orders where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Orders Orders =
	 * createObject(rs); OrdersList.add(Orders); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return OrdersList; }
	 */		
}
