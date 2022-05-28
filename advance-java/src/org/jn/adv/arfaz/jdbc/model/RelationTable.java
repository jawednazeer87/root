package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//base_relation_table ( id, brands_id, category_id, collection_id)
	//POJO - Plain Old Java Object
	public class RelationTable implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id, brands_id, category_id, collection_id;
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

		public Integer getBrands_id() {
			return brands_id;
		}

		public void setBrands_id(Integer brands_id) {
			this.brands_id = brands_id;
		}

		public Integer getCategory_id() {
			return category_id;
		}

		public void setCategory_id(Integer category_id) {
			this.category_id = category_id;
		}

		public Integer getCollection_id() {
			return collection_id;
		}

		public void setCollection_id(Integer collection_id) {
			this.collection_id = collection_id;
		}

		@Override
		public String toString() {
			return "RelationTable [id=" + id + ", brands_id=" + brands_id + ", category_id=" + category_id
					+ ", collection_id=" + collection_id + "]";
		}
		
		
				
		
	}