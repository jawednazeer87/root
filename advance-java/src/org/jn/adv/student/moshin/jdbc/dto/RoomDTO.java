package org.jn.adv.student.moshin.jdbc.dto;

public class RoomDTO {
	
	private Integer room_id;
	private Integer floor_num;
	private Integer seat_capacity;
	
	

	/**
	 * @return the room_id
	 */
	public Integer getRoom_id() {
		return room_id;
	}

	/**
	 * @param room_id the room_id to set
	 */
	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}

	/**
	 * @return the floor_num
	 */
	public Integer getFloor_num() {
		return floor_num;
	}

	/**
	 * @param floor_num the floor_num to set
	 */
	public void setFloor_num(Integer floor_num) {
		this.floor_num = floor_num;
	}


	/**
	 * @return the seat_capacity
	 */
	public Integer getSeat_capacity() {
		return seat_capacity;
	}

	/**
	 * @param seat_capacity the seat_capacity to set
	 */
	public void setSeat_capacity(Integer seat_capacity) {
		this.seat_capacity = seat_capacity;
	}

	@Override
	public String toString() {
		
		return "{room_id: "+room_id+", floor_num: "+floor_num+", seat_capacity: "+seat_capacity+",}";
	}
}