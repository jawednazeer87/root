package org.jn.core.java.student.sayed.hassain.clss;

public class RoomMain {
	
	public static void main(String[] args) {
		
		Room room=new Room();
		room.setterRoomId(102);
		System.out.println(room.getterRoomId());
		
		room.setterFloorNum(2);
		System.out.println(room.getterFloorNum());
		
		room.setterSeatCapacity(100);
		System.out.println(room.getterSeatCapacity());
	}

}
