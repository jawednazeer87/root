package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;
import java.time.LocalDate;

//products ( id, merchant_id, name, price, status, created_at )
	//POJO - Plain Old Java Object
	public class Products implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id,merchant_id;
		private String name;
		private Integer price;
		private Boolean status;
		private LocalDate created_at;
		/**
		 * @return the return id
		 */
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		/* * 
		 * @param companyId the assign id to set
		 */
		public Integer getMerchant_id() {
			return merchant_id;
		}
		public void setMerchant_id(Integer merchant_id) {
			this.merchant_id = merchant_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public Boolean getStatus() {
			return status;
		}
		public void setStatus(Boolean status) {
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
			return "Products [id=" + id + ", merchant_id=" + merchant_id + ", name=" + name + ", price=" + price
					+ ", status=" + status + ", created_at=" + created_at + "]";
		}
		
		
		
		
		
		
		
				 	
		

	
		
			
		
	}