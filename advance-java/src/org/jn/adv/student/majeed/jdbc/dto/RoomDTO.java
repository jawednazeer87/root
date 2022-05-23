package org.jn.adv.student.majeed.jdbc.dto;

/**
* @author AbdulMajeed
*
*/

public class RoomDTO {

	private Integer roomId;
	private Integer floorNum;
	private Integer seatCapacity;
	
	
	public Integer getRoomId() {
		return roomId;
	}


	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}


	public Integer getFloorNum() {
		return floorNum;
	}


	public void setFloorNum(Integer floorNum) {
		this.floorNum = floorNum;
	}


	public Integer getSeatCapacity() {
		return seatCapacity;
	}


	public void setSeatCapacity(Integer seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

/*
	@Override
	public String toString() {
		return "{roomId: " + roomId + ", floorNum: " + floorNum + ", seatCapacity: " + seatCapacity + "}";
	}
	*/		
}
