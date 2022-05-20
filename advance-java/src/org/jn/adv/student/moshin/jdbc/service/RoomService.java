package org.jn.adv.student.moshin.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.model.Room;
import org.jn.adv.student.moshin.jdbc.repository.EmployeeRepository;
import org.jn.adv.student.moshin.jdbc.repository.RoomRepository;
import org.jn.adv.student.moshin.jdbc.util.GetSqlConnectionStudentDB;

public class RoomService {

private Connection con = null;
	
	public RoomService() {
		con = GetSqlConnectionStudentDB.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnectionStudentDB.connectionClose();
	}
	
	public List<Room> getAll(){
		List<Room> roomList = new ArrayList<>();
		if(con!=null) {
			roomList = RoomRepository.getAll(con);
		}
		return roomList;
	}
	
	public Room findById(int id){
		
		Room room = null;
		
		if(con!=null) {
			room = RoomRepository.findById(con, id);
		}
		
		return room;
	}
	
	public int deleteById(int room_id) {
		return RoomRepository.deleteById(con, room_id);
	}
	
	public void create(Room room) {
		RoomRepository.create(con, room);
	}
	
	public void update(Room room) {
		RoomRepository.update(con, room);
	}

	public List<Room> getByName(String Room_id) {
		return RoomRepository.getByRoom_id(con, Room_id);
	}
	public List<Room> getByDobRange(LocalDate startDate, LocalDate endDate) {
		return RoomRepository.getByDobRange(con, startDate, endDate);
	}
	
}
