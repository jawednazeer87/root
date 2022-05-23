package org.jn.adv.student.majeed.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.majeed.jdbc.model.Room;

public class RoomRepository  //DAO Data Access Object
{
	
	private static Room createObject(ResultSet rs) throws SQLException {
		Room room = new Room();
		room.setRoomId(rs.getInt("room_id"));		
		room.setFloorNum(rs.getInt("floor_num"));
		room.setSeatCapacity(rs.getInt("seat_capacity"));
		return room;
	}
	
	public static List<Room> getAll(Connection con) {

		System.out.println("-----------getAllRoom------------");
		System.out.println();
		
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

	public static Room findById(Connection con, int roomId) {

		System.out.println("-----------findRoomById roomid: "+roomId);
		System.out.println();
		
		ResultSet rs = null;
		Room room = null;
		PreparedStatement pStatement = null;

		try {
			String query = " select * from room where room_id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, roomId);
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

		System.out.println("-----------createRoom------------");

		PreparedStatement pStatement = null;

		try{  

			String query = 	  "INSERT INTO room(room_id, floor_num, seat_capacity) "
					+ " VALUES (?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, room.getRoomId());
			pStatement.setInt(2, room.getFloorNum());
			pStatement.setInt(3, room.getSeatCapacity());
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
			pStatement.setInt(1, room.getRoomId());
			pStatement.setInt(2, room.getFloorNum());
			pStatement.setInt(3, room.getSeatCapacity());
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

	public static Room deleteById(Connection con, int roomId) {

		System.out.println("-----------deleteRoomById Roomid: "+roomId);

		int executeUpdate = 0;
		Room room = null;
		
		PreparedStatement pStatement = null;

		try {
			String query = "delete from room where room_id=?";
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

		return room;
	}
}
	
