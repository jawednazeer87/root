package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//09. hourly_employee ( id, hourly_rate, employee_id )

	//POJO - Plain Old Java Object
	public class HourlyEmployee implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id, hourly_rate, employee_id ;
		
		
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
		 * @return the return hourly_rate
		 */
		public Integer getHourly_rate() {
			return hourly_rate;
		}
		
		
		/* * 
		 * @param hourly_rate the assign hourly_rate to set
		 */
		public void setHourly_rate(Integer hourly_rate) {
			this.hourly_rate = hourly_rate;
		}
		/**
		 * @return the return employee_id
		 */
		public Integer getEmployee_id() {
			return employee_id;
		}
		/* * 
		 * @param employee_id the assign employee_id to set
		 */
		public void setEmployee_id(Integer employee_id) {
			this.employee_id = employee_id;
		}
		
		@Override
		public String toString() {
			return "HourlyEmployee [id=" + id + ", hourly_rate=" + hourly_rate + ", employee_id=" + employee_id + "]";
		}
		
		
		
		
		

	
		
			
		
	}