package org.la.core.java.student.nizaam.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.la.core.java.student.nizaam.jdbc.model.Room;
import org.la.core.java.student.nizaam.jdbc.util.ConnectionUtil;

public class RoomRepository {
	
	private static Connection connection;
	
	public static void createRoom(int floorNum, int seatCapacity) throws Exception {
		connection = ConnectionUtil.OpenConnection();
		PreparedStatement ps = null;
		int executeUpdate = 0;
		
		try {
			String query = "Insert into room(floor_num,seat_capacity) values(?,?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, floorNum);
			ps.setInt(2, seatCapacity);
			executeUpdate = ps.executeUpdate();
			if(executeUpdate >0) {
				System.out.println("successfully created Room :  "+executeUpdate);
			}
			else {
				System.out.println("failed to create Room : "+ executeUpdate);
			}
		}catch(Exception e) {
			System.out.println("Room creation : "+e.getMessage());
		}finally {
			try {
				if(ps !=null)
					ps.close();
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			connection.close();
		}
	}
	
	public static List<Room> findRoomByFloorNum(int FloorNum) throws Exception{
		connection = ConnectionUtil.OpenConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Room> roomList = new ArrayList<>();
		
		try {
			String query = "select * from Room where floor_num=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, FloorNum);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Room room = new Room(rs.getInt(1),rs.getInt(2),rs.getInt(3));
				roomList.add(room);
				
			}
		}catch(Exception e) {
			System.out.println("Find by Room ID : "+ e.getMessage());
		}
		
		return roomList;
	}

	public static Room findRoomById(int RoomId) throws Exception{
		connection = ConnectionUtil.OpenConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			String query = "select * from Room where room_id=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, RoomId);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				return new Room(rs.getInt(1),rs.getInt(2),rs.getInt(3));
				
				
			}
		}catch(Exception e) {
			System.out.println("Find by Room ID : "+ e.getMessage());
		}
		
		return null;
	}

}
