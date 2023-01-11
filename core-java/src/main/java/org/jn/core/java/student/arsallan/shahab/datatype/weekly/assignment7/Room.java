package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class Room {
	
	int roomId;
	int floorNum;
	int seatCapacity;
	
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getFloorNum() {
		return floorNum;
	}
	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", floorNum=" + floorNum + ", seatCapacity=" + seatCapacity + "]";
	}
	
}
