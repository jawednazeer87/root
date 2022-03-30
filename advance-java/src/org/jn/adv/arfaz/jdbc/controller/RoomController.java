package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.Room;
import org.jn.adv.arfaz.jdbc.service.RoomService;

public class RoomController {
//	room ( room_id, floor_num, seat_capacity )
	// after invoking constructor. It will connect with database and show msg connected
	static RoomService roomService = new RoomService();
		public static void main(String[] args) {
			create();
//			updateOpera();
//			getById(3);
//			findAll();
//			deleteOpera();
			
			
		}
		
//		create database and insert into table create operation
		static void create() {
			Room room = new Room();
			room.setRoom_id(4);
			room.setFloor_num(4);
//			name, description, primary_contact_attendee_id
			room.setSeat_capacity(35);
			roomService.create(room);
			roomService.connectionClose();
		}

		// read operation		
		static void getById(int i)  {
			System.out.println(roomService.findById(i));	
		}
//		read operation
		static void findAll(){
			System.out.println(roomService.getAll());
		}
		
//		delete operation
		static void deleteOpera() {
			roomService.deleteById(1);
		}
//		update the row or column
		static void updateOpera() {
			Room room = new Room();
			room.setRoom_id(3);
			room.setFloor_num(18);
//			name, description, primary_contact_attendee_id
			room.setSeat_capacity(19);
			
			roomService.update(room);
			roomService.connectionClose();

			
		}
//		static List<RoomDTO> getAll() {
//			List<Room> RoomList = RoomService.getAll();
//			RoomService.connectionClose();
//			final List<RoomDTO> dtoList = new ArrayList<>();
//			RoomList.stream().forEach(Room-> {
//				RoomDTO dto = GSONGenericUtil.map(Room, RoomDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<RoomDTO> getByDobRange() {
//			List<Room> RoomList = RoomService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			RoomService.connectionClose();
//			List<RoomDTO> dtoList = GSONGenericUtil.mapList(RoomList, RoomDTO.class);
//			return dtoList;
//		}
		
		
	}
