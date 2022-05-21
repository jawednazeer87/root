package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//16. brands ( id, brand_name, thumbnails )
	//POJO - Plain Old Java Object
	public class Brands implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer  id;
		String thumbnails;
		String brand_name;
			/**
		 * @return the return Attendee_id
		 */
		public Integer getId() {
			return id;
		}
		/**
		 * @param attendee_id the assign attendee_id to set
		 */
		
		public void setId(Integer id) {
			this.id = id;
		}
		public String getThumbnails() {
			return thumbnails;
		}
		public void setThumbnails(String thumbnails) {
			this.thumbnails = thumbnails;
		}
		public String getBrand_name() {
			return brand_name;
		}
		public void setBrand_name(String brand_name) {
			this.brand_name = brand_name;
		}
		@Override
		public String toString() {
			return "Brands [id=" + id + ", thumbnails=" + thumbnails + ", brand_name=" + brand_name + "]";
		}
		
		
				
		
	}