package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;
import java.time.LocalDate;

//orders ( id, user_id, status, created_at )
	//POJO - Plain Old Java Object
	public class Orders implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id, user_id;
		boolean status; 
		private LocalDate created_at;

		/**
		 * @return the return id
		 */
		
	
		public Integer getId() {
			return id;
		}
		/* * 
		 * @param companyId the assign id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getUser_id() {
			return user_id;
		}
		public void setUser_id(Integer user_id) {
			this.user_id = user_id;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		public LocalDate getCreated_at() {
			return created_at;
		}
		public void setCreated_at(LocalDate created_at) {
			this.created_at = created_at;
		}
		@Override
		public String toString() {
			return "Orders [id=" + id + ", user_id=" + user_id + ", status=" + status + ", created_at=" + created_at
					+ "]";
		}
		
		
		
		

	
		
			
		
	}