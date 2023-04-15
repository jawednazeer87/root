package org.jn.core.java.student.shoaeeb.jdbc.model;
//-- 	14.	client ( name, address, city, 
//state, zip, country, email )

public class Client {
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", country=" + country + ", email=" + email + "]";
	}
	
	
	
	
}
