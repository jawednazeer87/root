package org.la.core.java.student.tanseer.assignment8.classes;

/*
 * Create a class Room having member variables roomId, floorNum, seatCapacity. create getters and 
	setters for all member variables. Create object of Room class in other class inside main method
	and set all member values and print all member values using getters.
 */
public class Room 
{
	 private int roomId;
	 private int floorNum;
	 private int seatCapacity;
	 
	 public void setRoomId(int roomId)
	 {
		 this.roomId = roomId;
	 }
	 
	 public int getRoomId()
	 {
		 return roomId;
	 }
	 public void setfloorNum(int floorNum)
	 {
		 this.floorNum = floorNum;
	 }
	 
	 public int getfloorNum()
	 {
		 return floorNum;
	 }
	 public void setSeatCapacity(int seatCapacity)
	 {
		 this.seatCapacity = seatCapacity;
	 }
	 
	 public int getSeatCapacity()
	 {
		 return seatCapacity;
	 }
}
