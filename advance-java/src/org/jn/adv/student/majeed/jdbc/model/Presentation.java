package org.jn.adv.student.majeed.jdbc.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Presentation implements Serializable {

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer presentationId;
		private String  bookedCompanyId ;
		private String bookedRoomId;
		private LocalDate  startTime;
		private LocalDate endTime;
		public Integer getPresentationId() {
			return presentationId;
		}
		public void setPresentationId(Integer presentationId) {
			this.presentationId = presentationId;
		}
		public String getBookedCompanyId() {
			return bookedCompanyId;
		}
		public void setBookedCompanyId(String bookedCompanyId) {
			this.bookedCompanyId = bookedCompanyId;
		}
		public String getBookedRoomId() {
			return bookedRoomId;
		}
		public void setBookedRoomId(String bookedRoomId) {
			this.bookedRoomId = bookedRoomId;
		}
		public LocalDate getStartTime() {
			return startTime;
		}
		public void setStartTime(LocalDate startTime) {
			this.startTime = startTime;
		}
		public LocalDate getEndTime() {
			return endTime;
		}
		public void setEndTime(LocalDate endTime) {
			this.endTime = endTime;
		}
		@Override
		public String toString() {
			return "Presentation [presentationId=" + presentationId + ", bookedCompanyId=" + bookedCompanyId
					+ ", bookedRoomId=" + bookedRoomId + ", startTime=" + startTime + ", endTime=" + endTime + "]";
		}	
}
