package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//( ticket_id, presentation_id, attendee_id )

	//POJO - Plain Old Java Object
	public class Presentation_attendance implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer ticket_id,presentation_id,attendee_id;
		/**
		 * @return the return Room_id
		 */

		public Integer getTicket_id() {
			return ticket_id;
		}
		/**
		 * @param Ticket_id the assign Presentation_id to set
		 */
		public void setTicket_id(Integer ticket_id) {
			this.ticket_id = ticket_id;
		}
		/**
		 * @return the return presenting_id
		 */
		public Integer getPresentation_id() {
			return presentation_id;
		}
		/**
		 * @param Presentation_id the assign Presentation_id to set
		 */
		public void setPresentation_id(Integer presentation_id) {
			this.presentation_id = presentation_id;
		}
		/**
		 * @return the return Attendee_id
		 */
		public Integer getAttendee_id() {
			return attendee_id;
		}
		/**
		 * @param Attendee_id the assign Attendee_id to set
		 */
		public void setAttendee_id(Integer attendee_id) {
			this.attendee_id = attendee_id;
		}
		@Override
		public String toString() {
			return "Presentation_attendance [ticket_id=" + ticket_id + ", presentation_id=" + presentation_id
					+ ", attendee_id=" + attendee_id + "]";
		}
		

				
		
	}