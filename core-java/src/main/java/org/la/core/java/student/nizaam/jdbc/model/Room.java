package org.la.core.java.student.nizaam.jdbc.model;

public class Room {

	private int room_id;
	private int floor_num;
	private int seat_capacity;
	
	Room(){}
	public Room(int roomId, int floorNum, int seatCapacity){
		this.room_id = roomId;
		this.floor_num = floorNum;
		this.seat_capacity = seatCapacity;
	}
	
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getFloor_num() {
		return floor_num;
	}
	public void setFloor_num(int floor_num) {
		this.floor_num = floor_num;
	}
	public int getSeat_capacity() {
		return seat_capacity;
	}
	public void setSeat_capacity(int seat_capacity) {
		this.seat_capacity = seat_capacity;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Room{" +
        "roomId=" + room_id +
        ", floorNum='" + floor_num + '\'' +
        ", seatCapacity='" + seat_capacity + '\'' +
       
        '}';
	}
	
}
