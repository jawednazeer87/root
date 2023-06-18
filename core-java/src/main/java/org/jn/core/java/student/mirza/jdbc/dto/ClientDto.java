package org.jn.core.java.student.mirza.jdbc.dto;

public class ClientDto {

	
	
		
		private String Name;
		private String Address;
		
		private String City;
		private int Zip;
		private String State;
		private String Country;
		private String Email;
		
		
		

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public String getCity() {
			return City;
		}

		public void setCity(String city) {
			City = city;
		}

		public int getZip() {
			return Zip;
		}

		public void setZip(int zip) {
			Zip = zip;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			State = state;
		}

		public String getCountry() {
			return Country;
		}

		public void setCountry(String country) {
			Country = country;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		@Override
		public String toString() {
			return " {Name=" + Name + ", Address=" + Address + ", City=" + City + ", Zip=" + Zip + ", State=" + State
					+ ", Country=" + Country + ", Email=" + Email + "}";
		}
		
		
	}
		


