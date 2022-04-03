package org.jn.adv.arfaz.jdbc.model;

import java.io.Serializable;
import java.time.LocalDate;

	//POJO - Plain Old Java Object
	public class Employee implements Serializable{

		private static final long serialVersionUID = -1443814004539007341L;
		
		private Integer id;
		private Integer companyId;
		private String firstName;
		private String lastName;
		private Double salary;
		private LocalDate dob;
		private boolean gender;

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
		 * @return the companyId
		 */
		public Integer getCompanyId() {
			return companyId;
		}

		/**
		 * @param companyId the companyId to set
		 */
		public void setCompanyId(Integer companyId) {
			this.companyId = companyId;
		}

		

		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the salary
		 */
		public Double getSalary() {
			return salary;
		}

		/**
		 * @param salary the salary to set
		 */
		public void setSalary(Double salary) {
			this.salary = salary;
		}

		/**
		 * @return the dob
		 */
		public LocalDate getDob() {
			return dob;
		}

		/**
		 * @param dob the dob to set
		 */
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}

		/**
		 * @return the gender
		 */
		public boolean getGender() {
			return gender;
		}

		/**
		 * @param gender the gender to set
		 */
		public void setGender(boolean gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "{id: "+id+", firstName: "+firstName+", lastName: "+lastName+", salary:  "+salary+ ", dob: "+dob+ ", gender: "+gender+"}";
		}
	}