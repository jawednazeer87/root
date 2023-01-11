package org.jn.core.java.student.shoaeeb.absclss;

public class RoomAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomAbsClass abs = new RoomAbsClassImpl();
		abs.setRoomId(1);
		abs.setFloorNum(5);
		abs.setCapacity(6);
		
		System.out.println("Room Id: "+abs.getRoomId()+" Floor num: "+abs.getFloorNum()+ " seatCapacity "+abs.getSeatCapacity());
	}

}
