package org.jn.core.java.student.mirza.baig.clss.object;

public class RoomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Room r= new Room();
	     r.setRoomId(102);
	     r.setFloorNum(02);
	     r.setSeatCapiity("2person allowed");
	     
	     System.out.println("roomId "+r.getRoomId());
	     System.out.println("floorNum "+r.getFloorNum());
	     System.out.println("seatCapiity "+r.getSeatCapiity());
	}

}
