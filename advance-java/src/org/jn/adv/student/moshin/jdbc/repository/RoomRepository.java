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
import org.jn.adv.student.moshin.jdbc.model.Room;

public class RoomRepository {
	public static List<Room> getAll(Connection con) {

		System.out.println("-----------getAllEmployee------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Room> roomList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from room");
			
			if(rs!=null) {
				while(rs.next())  {
					Room room = createObject(rs);
					roomList.add(room);
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
		return roomList;
	}
	
	public static Room findById(Connection con, int room_id) {

		System.out.println("-----------findRoom_id room_id: "+room_id);

		ResultSet rs = null;
		Room room = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from room where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, room_id);
			rs = pStatement.executeQuery();
			
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
		
		System.out.println("-----------createEmployee------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = 	  "INSERT INTO room(room_id, floor_num, seat_capacity) "
							+ " VALUES (?, ?, ?, ?, ?, ?)";
			
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getRoom_id());
			pStatement.setInt(2, room.getFloor_num());
			pStatement.setInt(3, room.getSeat_capacity());
			
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
			
			String query = 	  " update room set room_id=?, floor_num=?, seat_capacity=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getRoom_id());
			pStatement.setInt(2, room.getFloor_num());
			pStatement.setInt(3, room.getSeat_capacity());
			
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

	public static int deleteById(Connection con, int room_id) {

		System.out.println("-----------deleteRoomById Room_id: "+room_id);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from room where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room_id);
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
		room.setRoom_id(rs.getInt("Room_id"));
		room.setFloor_num(rs.getInt("Floor_num"));
		room.setSeat_capacity(rs.getInt("Seat_capacity"));
		return room;
	}
	
	public static List<Room> getByRoom_id(Connection con, String Room_id) {
		
		System.out.println("RoomID: "+Room_id);
		
		List<Room> roomList = new ArrayList<>();
		String query = " select * from room where Room_id like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setString(1,  "%" + Room_id + "%");
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Room room = createObject(rs);
				roomList.add(room);
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
		return roomList;
	}
	
	public static List<Room> getByDobRange(Connection con, LocalDate startDate, LocalDate endDate) {
		
		List<Room> roomList = new ArrayList<>();
		String query = " select * from room where dob between ? and ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setDate(1, Date.valueOf(startDate));
			pStatement.setDate(2, Date.valueOf(endDate));
			
			rs = pStatement.executeQuery();
			while(rs.next())  {
				Room room = createObject(rs);
				roomList.add(room);
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
		return roomList;
	}
}
