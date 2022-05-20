package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;
import java.time.LocalDate;

//12. users ( id, full_name, email, gender, date_of_birth, country_code, created_at )
	//POJO - Plain Old Java Object
	public class Users implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id;
		private String full_name;
		private String email;
		private Boolean gender;
		private LocalDate date_of_birth;
		private String country_code;
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
		public String getFull_name() {
			return full_name;
		}
		public void setFull_name(String full_name) {
			this.full_name = full_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Boolean getGender() {
			return gender;
		}
		public void setGender(Boolean gender) {
			this.gender = gender;
		}
		public LocalDate getDate_of_birth() {
			return date_of_birth;
		}
		public void setDate_of_birth(LocalDate date_of_birth) {
			this.date_of_birth = date_of_birth;
		}
		public String getCountry_code() {
			return country_code;
		}
		public void setCountry_code(String country_code) {
			this.country_code = country_code;
		}
		public LocalDate getCreated_at() {
			return created_at;
		}
		public void setCreated_at(LocalDate created_at) {
			this.created_at = created_at;
		}
		@Override
		public String toString() {
			return "Users [id=" + id + ", full_name=" + full_name + ", email=" + email + ", gender=" + gender
					+ ", date_of_birth=" + date_of_birth + ", country_code=" + country_code + ", created_at="
					+ created_at + "]";
		}
		
		
		
		
		
				 	
		

	
		
			
		
	}