package org.la.core.java.student.nizaam.jdbc.service;

import java.util.List;

import org.la.core.java.student.nizaam.jdbc.model.Room;
import org.la.core.java.student.nizaam.jdbc.repository.RoomRepository;

public class RoomService {

	public void createRoom(int floorNum, int seatCapacity) throws Exception {
		RoomRepository.createRoom(floorNum, seatCapacity);
	}
	
	public List<Room> findRoomByFloorNum(int floorNum) throws Exception{
		return RoomRepository.findRoomByFloorNum(floorNum);
	}
	
	public Room findByRoomId(int roomId) throws Exception{
		return RoomRepository.findRoomById(roomId);
	}
}
