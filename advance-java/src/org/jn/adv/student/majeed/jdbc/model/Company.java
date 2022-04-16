package org.jn.adv.student.majeed.jdbc.model;

import java.io.Serializable;

public class Company implements Serializable {

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id;
		private String name;
		private String description;
		private Integer primaryContactAttendeeId;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Integer getPrimaryContactAttendeeId() {
			return primaryContactAttendeeId;
		}
		public void setPrimaryContactAttendeeId(Integer primaryContactAttendeeId) {
			this.primaryContactAttendeeId = primaryContactAttendeeId;
		}

		@Override
		public String toString() {
			return "{id: " + id + ", name: " + name + ", description: " + description
					+ ", primaryContactAttendeeId: " + primaryContactAttendeeId + "}";
		}		
}
