package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;
import java.time.LocalDate;

//merchants ( id, merchant_name, admin_id, country_code, created_at )
	//POJO - Plain Old Java Object
	public class Merchants implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id,  admin_id;
		private String merchant_name;
		private String country_code;
		private LocalDate created_at;
		/**
		 * @return the return id
		 */
		public Integer getId() {
			return id;
		}

		/* * 
		 * @param id the assign id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getAdmin_id() {
			return admin_id;
		}
		public void setAdmin_id(Integer admin_id) {
			this.admin_id = admin_id;
		}
		public String getMerchant_name() {
			return merchant_name;
		}
		public void setMerchant_name(String merchant_name) {
			this.merchant_name = merchant_name;
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
		
				
		
		
		
		
				 	
		

	
		
			
		
	}