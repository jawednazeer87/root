package org.jn.adv.student.majeed.jdbc.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Presentation implements Serializable {

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer presentationId;
		private Integer  bookedCompanyId ;
		private Integer bookedRoomId;
		private Timestamp  startTime;
		private Timestamp endTime;
		
		public Integer getPresentationId() {
			return presentationId;
		}
		public void setPresentationId(Integer presentationId) {
			this.presentationId = presentationId;
		}
		public Integer getBookedCompanyId() {
			return bookedCompanyId;
		}
		public void setBookedCompanyId(Integer bookedCompanyId) {
			this.bookedCompanyId = bookedCompanyId;
		}
		public Integer getBookedRoomId() {
			return bookedRoomId;
		}
		public void setBookedRoomId(Integer bookedRoomId) {
			this.bookedRoomId = bookedRoomId;
		}
		public Timestamp getStartTime() {
			return startTime;
		}
		public void setStartTime(Timestamp startTime) {
			this.startTime = startTime;
		}
		public Timestamp getEndTime() {
			return endTime;
		}
		public void setEndTime(Timestamp endTime) {
			this.endTime = endTime;
		}
		@Override
		public String toString() {
			return "Presentation [presentationId=" + presentationId + ", bookedCompanyId=" + bookedCompanyId
					+ ", bookedRoomId=" + bookedRoomId + ", startTime=" + startTime + ", endTime=" + endTime + "]";
		}	
}
