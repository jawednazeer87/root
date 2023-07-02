 package org.student.three.mirza.rest.controller;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.stream.Collectors;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.DeleteMapping;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.PutMapping;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.RestController;
 import org.student.three.mirza.modal.Room;
 import org.student.three.mirzaa.service.RoomService;


 @RestController                           // restctorller annotation indicate as rest class 
 @RequestMapping("/room")
 public class RoomRestController {

 	@Autowired
 	private RoomService roomService;
 	
 	List<Room> roomList = new ArrayList<>();
 	
 	@DeleteMapping("/delete-by-id/{id}")
 	public void deleteById(@PathVariable long id) {
 		roomService.deleteById(id); 
 	}
 	
 	@PutMapping("/update-room-id-by-floorNum/{floorNum}")
 	public Room updateByRoomId(@PathVariable int roomId, @RequestParam int floorNum) {
 		return roomService.updateByRoomId(roomId, floorNum);
 	}
 	
 	@GetMapping("/find_by_roomId/{roomId}")
 	public Room findByRoomId(@PathVariable int roomId) {
 		return roomService.findByRoomId(roomId);
 	}
 	
 	@GetMapping("/find-by-hotel-name")
 	List<Room> findByHotelName(@RequestParam String hotelName) {
 		return roomService.findByHotelName(hotelName);
 	}
 	
 	@PostMapping("/add")
 	public Room add(@RequestBody Room room) {
 		System.out.println(room);
 		roomList.add(room);
 		return room;
 	}
 	
 	@PostMapping("/create")
 	public Room create(@RequestBody Room  room) {
 		return roomService.create(room);
 	}
 	
 	@GetMapping("/get/all")               
 	public List<Room> getAll() {
 		return roomService.getAll();
 	}
 	
 	@GetMapping("/get")
 	public List<Room> get() {
 		return roomList;
 	}
 	
 	@GetMapping("/get/{id}")
 	public Room findId(@PathVariable int id) {
 		List<Room> collect = roomList.stream().filter(room -> room.getId()==id).collect(Collectors.toList());
 		return collect.get(0);
 	}
 }


 
 
 

