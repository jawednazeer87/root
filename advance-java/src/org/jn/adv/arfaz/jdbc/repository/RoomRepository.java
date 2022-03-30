package org.jn.adv.arfaz.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Room;

public class RoomRepository {
	public static List<Room> getAll(Connection con) {

		System.out.println("-----------getAllRoom------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Room> RoomList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from room_floor");
			
			if(rs!=null) {
				while(rs.next())  {
					Room room = createObject(rs);
					RoomList.add(room);
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
		return RoomList;
	}
	
	public static Room findById(Connection con, int roomId) {

		System.out.println("-----------findRoomById Roomid: "+roomId);

		ResultSet rs = null;
		Room room = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from room_floor where room_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, roomId);
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
	
	public static void create(Connection con, Room room) {
		
		System.out.println("-----------createRoom------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO room_floor(room_id, floor_num,seat_capacity) "
							+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getRoom_id());
			pStatement.setInt(2, room.getFloor_num());
			pStatement.setInt(3, room.getSeat_capacity());
			
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
	
	public static void update(Connection con, Room room) {
		
		System.out.println("-----------updateRoom------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  " update room_floor set floor_num=?, seat_capacity = ?"
							+ " where room_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getFloor_num());
			pStatement.setInt(2, room.getSeat_capacity());
			pStatement.setInt(3, room.getRoom_id());
			
			
//			pStatement.setDate(5, Date.valueOf(room.getDob()));
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

	public static int deleteById(Connection con, int roomId) {

		System.out.println("-----------deleteRoomById Roomid: "+roomId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from room_floor where room_id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, roomId);
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

	private static Room createObject(ResultSet rs) throws SQLException {
		Room room = new Room();
		room.setRoom_id(rs.getInt("room_id"));
		room.setFloor_num(rs.getInt("floor_num"));
		room.setSeat_capacity(rs.getInt("seat_capacity"));
//		room.setDob(rs.getDate("dob").toLocalDate());
//		room.setGender(rs.getBoolean("gender"));
		return room;
	}
	
	/*
	 * public static List<Room> getByFirstName(Connection con, String firstName)
	 * {
	 * 
	 * System.out.println("firstName: "+firstName);
	 * 
	 * List<Room> RoomList = new ArrayList<>(); String query =
	 * " select * from room where floor_num like ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) { pStatement.setString(1, "%" + firstName +
	 * "%"); rs = pStatement.executeQuery(); while(rs.next()) { Room Room =
	 * createObject(rs); RoomList.add(Room); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return RoomList; }
	 * 
	 * public static List<Room> getByDobRange(Connection con, LocalDate
	 * startDate, LocalDate endDate) {
	 * 
	 * List<Room> RoomList = new ArrayList<>(); String query =
	 * " select * from Room where dob between ? and ? ";
	 * 
	 * ResultSet rs = null; try(PreparedStatement pStatement =
	 * con.prepareStatement(query)) {
	 * 
	 * pStatement.setDate(1, Date.valueOf(startDate)); pStatement.setDate(2,
	 * Date.valueOf(endDate));
	 * 
	 * rs = pStatement.executeQuery(); while(rs.next()) { Room Room =
	 * createObject(rs); RoomList.add(Room); } } catch(Exception e) {
	 * e.printStackTrace(); } finally { try { if(rs!=null) { rs.close(); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return RoomList; }
	 */		
}
