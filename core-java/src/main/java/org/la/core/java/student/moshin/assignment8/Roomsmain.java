package org.la.core.java.student.moshin.assignment8;

public class Roomsmain {
	public static void main(String[] args) {
		Rooms room = new Rooms();
		
		room.setRoomId(10);
		room.setFloorNum(1);
		room.setSeatCapacity(4);
		
		System.out.println("Room ID: "+room.getRoomId());
		System.out.println("Floor Num: "+room.getFloorNum());
		System.out.println("Seat Capacity: "+room.getSeatCapacity());
	}
}
