package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//collections ( id, collection_name, thumbnails )
//POJO - Plain Old Java Object
	public class Categories implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer  id ;
		String category_name;
		String thumbnails;
	
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

		public String getCategory_name() {
			return category_name;
		}

		public void setCategory_name(String category_name) {
			this.category_name = category_name;
		}

		public String getThumbnails() {
			return thumbnails;
		}

		public void setThumbnails(String thumbnails) {
			this.thumbnails = thumbnails;
		}
		@Override
		public String toString() {
			return "Categories [id=" + id + ", category_name=" + category_name + ", thumbnails=" + thumbnails + "]";
		}
		
		
		
		
		
	}		