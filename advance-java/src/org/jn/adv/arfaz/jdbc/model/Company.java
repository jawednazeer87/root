package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

	//POJO - Plain Old Java Object
	public class Company implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer companyId;
		private String Name;
		private String description;
		private Integer primary_contact_attendee_id;
		
		
		/**
		 * @return the primary_contact_attendee_id
		 */
		
		public Integer getPrimary_contact_attendee_id() {
			return primary_contact_attendee_id;
		}
		/**
		 * @param companyId the primary_contact_attendee_id to set
		 */
		
		public void setPrimary_contact_attendee_id(Integer primary_contact_attendee_id) {
			this.primary_contact_attendee_id = primary_contact_attendee_id;
		}

		/**
		 * @return the companyId
		 */
		
		public Integer getCompanyId() {
			return companyId;
		}

		/**
		 * @param companyId the companyId to set
		 */
		
		public void setCompanyId(Integer companyId) {
			this.companyId = companyId;
		}

		/**
		 * @return the Name
		 */
		
		public String getName() {
			return Name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			Name = name;
		}
		/**
		 * @return the Description
		 */
		public String getDescription() {
			return description;
		}
		/**
		 * @param name the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Company [companyId=" + companyId + ", Name=" + Name + ", description=" + description +"primary_contact_attendee_id=" +primary_contact_attendee_id+"]"+"\n";
		}
		
		
	}