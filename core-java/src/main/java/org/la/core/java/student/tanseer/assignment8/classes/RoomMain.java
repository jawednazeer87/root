package org.la.core.java.student.tanseer.assignment8.classes;

public class RoomMain 
{
	public static void main(String[] args) 
	{
		Room room = new Room();
		room.setRoomId(121);
		room.setfloorNum(2);
		room.setSeatCapacity(20);
		
		System.out.println("Room  ID   : "+room.getRoomId());
		System.out.println("Floor NO   : "+room.getfloorNum());
		System.out.println("Seating NO : "+room.getSeatCapacity());
	}
}
