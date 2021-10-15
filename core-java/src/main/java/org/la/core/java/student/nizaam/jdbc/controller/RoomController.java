package org.la.core.java.student.nizaam.jdbc.controller;

import java.util.List;

import org.la.core.java.student.nizaam.jdbc.model.Room;
import org.la.core.java.student.nizaam.jdbc.service.RoomService;

public class RoomController {
	
	public static void main(String[] args) {
		RoomService roomser = new RoomService();
		
		try {
			roomser.createRoom(3,30);
			List<Room> rl = roomser.findRoomByFloorNum(2);
			for(Room room : rl) {
				System.out.println(room.toString());
			}
			
			Room room = roomser.findByRoomId(1);
			System.out.println(room.toString());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	

}
