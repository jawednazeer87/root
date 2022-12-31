package org.jn.core.java.student.shoaeeb.clss;

public class RoomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r= new Room();
		r.setRoomId(1);
		r.setFloorNum(5);
		r.setSeatCapacity(20);
		
		//printing
		System.out.println(r.getRoomId());
		System.out.println(r.getFloorNum());
		System.out.println(r.getSeatCapacity());
	}

}
