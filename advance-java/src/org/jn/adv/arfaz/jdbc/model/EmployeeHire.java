package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;
import java.time.LocalDate;

	//POJO - Plain Old Java Object
//06. employeehire ( id, employee_name, employee_num, date_hired, city_id )
	public class EmployeeHire implements Serializable{

		
		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id;
		private String employee_name;
		private Integer employee_num;
		private Integer city_id ;
		private LocalDate date_hired;
		
		/**
		 * @return the id
		 */
		
		public Integer getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		
		/**
		 * @return the employee_name
		 */
		
		public String getEmployee_name() {
			return employee_name;
		}
		/**
		 * @param employee_name the employee_name to set
		 */
		
		public void setEmployee_name(String employee_name) {
			this.employee_name = employee_name;
		}
		/**
		 * @return the employee_num
		 */
		
		public Integer getEmployee_num() {
			return employee_num;
		}
		/**
		 * @param employee_num the employee_num to set
		 */
		
		public void setEmployee_num(Integer employee_num) {
			this.employee_num = employee_num;
		}
		/**
		 * @return the city_id
		 */

		public Integer getCity_id() {
			return city_id;
		}
		/**
		 * @param city_id the city_id to set
		 */
		
		public void setCity_id(Integer city_id) {
			this.city_id = city_id;
		}
		/**
		 * @return the date_hired
		 */
		public LocalDate getDate_hired() {
			return date_hired;
		}
		
		/**
		 * @param date_hired the date_hired to set
		 */
		public void setDate_hired(LocalDate date_hired) {
			this.date_hired = date_hired;
		}
		
		@Override
		public String toString() {
			return "EmployeeHire [id=" + id + ", employee_name=" + employee_name + ", employee_num=" + employee_num
					+ ", city_id=" + city_id + ", date_hired=" + date_hired + "]";
		}

		
		

		}