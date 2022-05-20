package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//countries ( code, name, continent_name )
	//POJO - Plain Old Java Object
	public class Countries implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
//		countries ( code, name, continent_name )
		private Integer code;
		String name;
		String continent_name;

		/**
		 * @return the return Attendee_id
		 */
	
		
		public Integer getCode() {
			return code;
		}
		

		/**
		 * @param attendee_id the assign attendee_id to set
		 */
		public void setCode(Integer code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContinent_name() {
			return continent_name;
		}
		public void setContinent_name(String continent_name) {
			this.continent_name = continent_name;
		}


		@Override
		public String toString() {
			return "Countries [code=" + code + ", name=" + name + ", continent_name=" + continent_name + "]";
		}
	
		
	}