package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//attendee(attendee_id, first_name, last_name, phone, email, vip )

	//POJO - Plain Old Java Object
	public class Attendee implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer attendee_id;
		String first_name;
		String last_name;
		String phone;
		String email;
		Boolean vip;
		/**
		 * @return the return Attendee_id
		 */
		public Integer getAttendee_id() {
			return attendee_id;
		}

		/**
		 * @param attendee_id the assign attendee_id to set
		 */
		public void setAttendee_id(Integer attendee_id) {
			this.attendee_id = attendee_id;
		}
		/**
		 * @return the return Firstname
		 */
		public String getFirst_name() {
			return first_name;
		}
		
		/**
		 * @param Firstname the assign Firstname to set
		 */
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		/**
		 * @return the return Lastname
		 */
		public String getLast_name() {
			return last_name;
		}
		/**
		 * @param Lastname the assign Lastname to set
		 */
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		/**
		 * @return the return Phoneno
		 */
		public String getPhone() {
			return phone;
		}
		/**
		 * @param Phoneno the assign Phoneno to set
		 */
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		/**
		 * @return the return Email
		 */
		public String getEmail() {
			return email;
		}
		/**
		 * @param Phoneno the assign Email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		
		/**
		 * @return the return Vip
		 */
		public Boolean getVip() {
			return vip;
		}
		
		/**
		 * @param Phoneno the assign Vip to set
		 */
		public void setVip(Boolean vip) {
			this.vip = vip;
		}

		@Override
		public String toString() {
			return "Attendee [attendee_id=" + attendee_id + ", first_name=" + first_name + ", last_name=" + last_name
					+ ", phone=" + phone + ", email=" + email + ", vip=" + vip + "]";
		}
		
				
		
	}