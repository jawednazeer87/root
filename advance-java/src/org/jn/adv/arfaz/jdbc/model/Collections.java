package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

// collections ( id, collection_name, thumbnails )

	//POJO - Plain Old Java Object
	public class Collections implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id;
		String collection_name;
		String thumbnails;
		/**
		 * @return the return Attendee_id
		 */

		
		
		public Integer getId() {
			return id;
		}
		/**
		 * @param id the assign id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}
		public String getCollection_name() {
			return collection_name;
		}
		public void setCollection_name(String collection_name) {
			this.collection_name = collection_name;
		}
		public String getThumbnails() {
			return thumbnails;
		}
		public void setThumbnails(String thumbnails) {
			this.thumbnails = thumbnails;
		}
		@Override
		public String toString() {
			return "Collections [id=" + id + ", collection_name=" + collection_name + ", thumbnails=" + thumbnails
					+ "]";
		}
		
		
		
				
		
	}