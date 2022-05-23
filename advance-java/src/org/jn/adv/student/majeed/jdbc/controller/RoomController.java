package org.jn.adv.student.majeed.jdbc.controller;


import org.jn.adv.student.majeed.jdbc.model.Room;
import org.jn.adv.student.majeed.jdbc.dto.RoomDTO;
import org.jn.adv.student.majeed.jdbc.service.RoomService;
import org.jn.adv.student.majeed.jdbc.util.GSONGenericUtil;

import java.util.List;
import java.util.ArrayList;

/**
* @author AbdulMajeed
*
*/

public class RoomController 
{

	static RoomService roomService = new RoomService();
	
	public static void main(String[] args) 
	{
		//create();				
		
		//getAll().stream().forEach(System.out::println);
//		System.out.println();
		
		//findById();
		//deleteById();
//		findById();
		getAlls();

	}
	
	static void create() 
	{
		Room room = new Room();
		room.setRoomId(3);
		room.setFloorNum(2);
		room.setSeatCapacity(150);
		roomService.create(room);
		roomService.connectionClose();
	}
	
	static List<RoomDTO> getAll() {
		List<Room> roomList = roomService.getAll();
		roomService.connectionClose();
		final List<RoomDTO> dtoList = new ArrayList<>();
		roomList.stream().forEach(room-> {
			RoomDTO dto = GSONGenericUtil.map(room, RoomDTO.class);
			dtoList.add(dto);
		});
		return dtoList;
	}	

	static List<Room> getAlls(){
		List<Room> roomList= roomService.getAll();
		System.out.println(roomList);
		roomService.connectionClose();
		return roomList;
	
	}
	
	static void deleteById() {
		Room room = new Room();
		room = roomService.deleteById(2);
		System.out.println(room);
	}
	
	static void findById() {
		Room room = new Room();
	room= roomService.findById(2);
		System.out.println(room);
		roomService.connectionClose();
	}
	
}
