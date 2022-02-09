package org.la.core.java.student.majeed.assignment8;

/*
	3.	Create a class Room having member variables roomId, floorNum, seatCapacity. create getters and 
		setters for all member variables. Create object of Room class in other class inside main method
		and set all member values and print all member values using getters.
 */

public class RoomMain {

	public static void main(String[] args) {
		Room room = new Room();
		
		room.setRoomId(10);
		room.setFloorNum(1);
		room.setSeatCapacity(4);
		
		System.out.println("Room ID: "+room.getRoomId());
		System.out.println("Floor Num: "+room.getFloorNum());
		System.out.println("Seat Capacity: "+room.getSeatCapacity());
	}
}
