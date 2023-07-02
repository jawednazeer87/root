package org.student.three.mirza.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roomId;
	@Column(name ="floor_num")
	private int floorNum;
	@Column(name ="room_capacity")
	private int roomCapaity;
	@Column (name ="hotel_name")
	private String hotelName;
	
	public Room() {}

	public long getId() {
		return roomId;
	}

	public void setId(long id) {
		this.roomId = roomId;
	}

	public int getFloorNum() {
		return floorNum;
	}

	public void setFloorNum(int floorNum) {
		this.floorNum =floorNum;
	}

	public int getRoomCapaity() {
		return roomCapaity;
	}

	public void setRoomCapaity(int roomCapaity) {
		this.roomCapaity = roomCapaity;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	@Override
	public String toString() {
		return " {roomId=" + roomId + ", floorNum=" + floorNum + ", roomCapaity=" + roomCapaity + ", hotelName=" + hotelName
				+ "}";
	}
	

}
