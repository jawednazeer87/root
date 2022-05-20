package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//city ( id, city )

	//POJO - Plain Old Java Object
	public class City implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id;
		private String city;
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
		/**
		 * @return the return city
		 */
		public String getCity() {
			return city;
		}
		/* * 
		 * @param city the assign city to set
		 */
		
		public void setCity(String city) {
			this.city = city;
		}

		
		@Override
		public String toString() {
			return "City [id=" + id + ", city=" + city + "]";
		}
		 	
		

	
		
			
		
	}