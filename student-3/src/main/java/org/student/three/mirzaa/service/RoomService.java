package org.student.three.mirzaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Room;
import org.student.three.mirza.repository.RoomRepository;

@ Service
public class RoomService {

	@Autowired
	RoomRepository  roomRepository;
	public List<Room> getAll(){
		return roomRepository.findAll();
	}
	
	public Room create(Room room) {
		return roomRepository.save(room);
	}
	

	
	public Room findByRoomId (int  roomId) {
		return roomRepository.findByRoomId(roomId);
	}
	
	public Room updateByRoomId(int roomId, int floorNum) {
		Room room =  roomRepository.findByRoomId(roomId);
		if (room != null) {
			room.setFloorNum(floorNum);
			room = roomRepository.save(room);
		}
		return room;
	}
	
	public void deleteById(long id) {
		Room room = roomRepository.getReferenceById(id);
		if (room != null) {
		roomRepository.delete(room);
		}
	}
public List<Room> findByHotelName(String hotelName){
		
	return roomRepository.findByHotelName(hotelName);

}
}