package org.jn.core.java.student.shoaeeb.absclss;

public abstract class RoomAbsClass {
	int roomId;
	int floorNum;
	int seatCapacity;
	
	public abstract void setRoomId(int roomId);
	public abstract void setFloorNum(int floorNum);
	public abstract void setCapacity(int seatCapacity);
	
	public abstract int getRoomId();
	public abstract int getFloorNum();
	public abstract int getSeatCapacity();
	
	
}
