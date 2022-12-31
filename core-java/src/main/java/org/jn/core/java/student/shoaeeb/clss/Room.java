package org.jn.core.java.student.shoaeeb.clss;

public class Room {
//	Create a class Room having member variables roomId, floorNum, seatCapacity. create getters and 
	//setters for all member variables. Create object of Room class in other class inside main method
	//and set all member values and print all member values using getters.
	
	private int roomId;
	private int floorNum;
	private int seatCapacity;
	
	public void setRoomId(int roomId)
	{
		this.roomId=roomId;
	}
	public void setFloorNum(int floorNum)
	{
		this.floorNum=floorNum;
	}
	public void setSeatCapacity(int seatCapacity)
	{
		this.seatCapacity=seatCapacity;
	}
	
	//getters
	public int getRoomId()
	{
		return roomId;
	}
	public int getFloorNum() {
		return floorNum;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	
}
