package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;

//room ( room_id, floor_num, seat_capacity )

	//POJO - Plain Old Java Object
	public class SalariedEmployee implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id, annual_salary, employee_id ;
		/**
		 * @return the return id
		 */

		public Integer getId() {
			return id;
		}

		/**
		 * @param companyId the assign id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}
		/**
		 * @return the Annual_salary
		 */

		public Integer getAnnual_salary() {
			return annual_salary;
		}
		/**
		 * @param companyId the assign id to set
		 */
		public void setAnnual_salary(Integer annual_salary) {
			this.annual_salary = annual_salary;
		}
		/**
		 * @return the Annual_salary
		 */
		public Integer getEmployee_id() {
			return employee_id;
		}
		/**
		 * @param companyId the assign id to set
		 */
		public void setEmployee_id(Integer employee_id) {
			this.employee_id = employee_id;
		}

		@Override
		public String toString() {
			return "SalariedEmployee [id=" + id + ", annual_salary=" + annual_salary + ", employee_id=" + employee_id
					+ "]";
		}


		
		

	
//		Employee ( id, annual_salary, employee_id  )
		
			
		
	}