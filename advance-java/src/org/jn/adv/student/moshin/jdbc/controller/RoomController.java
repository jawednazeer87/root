package org.jn.adv.student.moshin.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.dto.EmployeeDTO;
import org.jn.adv.student.moshin.jdbc.dto.RoomDTO;
import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.model.Room;
import org.jn.adv.student.moshin.jdbc.service.EmployeeService;
import org.jn.adv.student.moshin.jdbc.service.RoomService;
import org.jn.adv.student.moshin.jdbc.util.GSONGenericUtil;

public class RoomController {
		static RoomService roomService = new RoomService();
		public static void main(String[] args) {
			create();
//			RoomDTO dto = GSONGenericUtil.map(getAll().get(5), RoomDTO.class);
//			System.out.println(dto);
//			getAll().stream().forEach(System.out::println);
//			getByDobRange().stream().forEach(System.out::println);
		}
		
		static void create() {
			Room room = new Room();
			room.setRoom_id(1);
			room.setFloor_num(8);
			room.setSeat_capacity(7);
		
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
		
		static List<RoomDTO> getByDobRange() {
			List<Room> roomList = roomService.getByDobRange(LocalDate.of(1979, 01, 10), 
																		LocalDate.of(2021, 01, 10));
			roomService.connectionClose();
			List<RoomDTO> dtoList = GSONGenericUtil.mapList(roomList, RoomDTO.class);
			return dtoList;
		}

}
