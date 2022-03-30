package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//room ( room_id, floor_num, seat_capacity )

	//POJO - Plain Old Java Object
	public class Room implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer room_id,floor_num,seat_capacity;
		/**
		 * @return the return Room_id
		 */
		
		public Integer getRoom_id() {
			return room_id;
		}
		/**
		 * @param companyId the assign Room_id to set
		 */
		public void setRoom_id(Integer room_id) {
			this.room_id = room_id;
		}
		/**
		 * @return the  floor num
		 */
		public Integer getFloor_num() {
			return floor_num;
		}
		/**
		 * @param companyId the assign Floor_num to set
		 */
		public void setFloor_num(Integer floor_num) {
			this.floor_num = floor_num;
		}
		/**
		 * @return the Seat_capacity
		 */
		public Integer getSeat_capacity() {
			return seat_capacity;
		}
		/**
		 * @param assign Seat_capacity
		 */
		
		public void setSeat_capacity(Integer seat_capacity) {
			this.seat_capacity = seat_capacity;
		}
		@Override
		public String toString() {
			return "Room [room_id=" + room_id + ", floor_num=" + floor_num + ", seat_capacity=" + seat_capacity + "]";
		}
		
//		room ( room_id, floor_num, seat_capacity )
		
			
		
	}