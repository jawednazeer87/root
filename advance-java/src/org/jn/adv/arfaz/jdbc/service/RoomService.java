package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Room;
import org.jn.adv.arfaz.jdbc.repository.RoomRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class RoomService {
private Connection con = null;
	
	public RoomService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Room> getAll(){
		List<Room> RoomList = new ArrayList<>();
		if(con!=null) {
			RoomList = RoomRepository.getAll(con);
		}
		return RoomList;
	}
	
	public Room findById(int id){
		
		Room room = null;
		
		if(con!=null) {
			room = RoomRepository.findById(con, id);
		}
		
		return room;
	}
	
	public int deleteById(int roomId) {
		return RoomRepository.deleteById(con, roomId);
	}
	
	public void create(Room room) {
		RoomRepository.create(con, room);
	}
	
	public void update(Room room) {
		RoomRepository.update(con, room);
	}

//	public List<Room> getByName(String firstName) {
//		return RoomRepository.getByFirstName(con, firstName);
//	}
//	public List<Room> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return RoomRepository.getByDobRange(con, startDate, endDate);
//	}
	
}