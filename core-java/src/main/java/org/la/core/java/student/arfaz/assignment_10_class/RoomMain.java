package org.la.core.java.student.arfaz.assignment_10_class;

public class RoomMain {

	public static void main(String[] args) {
		Room pob =  new Room();
		pob.setroomId(1);
		pob.setfloorNum(1);
		pob.setseatCapacity(1);
//	roomId, floorNum, seatCapacity
	
		System.out.println(pob.getroomId());
		System.out.println(pob.getfloorNum());
		System.out.println(pob.getseatCapacity());

	}

}
