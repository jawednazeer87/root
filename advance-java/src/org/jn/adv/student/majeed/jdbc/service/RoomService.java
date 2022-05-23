package org.jn.adv.student.majeed.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.majeed.jdbc.model.Room;
import org.jn.adv.student.majeed.jdbc.repository.RoomRepository;
import org.jn.adv.student.majeed.jdbc.util.GetSqlConnection;

public class RoomService 
{
	private Connection con = null;
	
	public RoomService()
	{
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose()
	{
		GetSqlConnection.connectionClose();
	}
	
	public List<Room> getAll(){
		List<Room> roomList = new ArrayList<>();
		if(con!=null) {
			roomList = RoomRepository.getAll(con);
		}
		return roomList;
	}
	
	public Room findById(int roomId){
		
		Room room = null;
		
		if(con!=null) {
			room = RoomRepository.findById(con, roomId);
		}
		
		return room;
	}
	
	public Room deleteById(int roomId) {
		Room room = null;
		
		if(con!=null) {
		 room = RoomRepository.deleteById(con, roomId);
		}
		return room;
	}
	
	public void create(Room room) {
		RoomRepository.create(con, room);
	}
	
	public void update(Room room) {
		RoomRepository.update(con, room);
	}
}
