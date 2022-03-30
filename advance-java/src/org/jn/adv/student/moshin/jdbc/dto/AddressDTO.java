package org.jn.adv.student.moshin.jdbc.dto;

import java.sql.Date;

/**
 * @author Waleed Rizq
 *
 * @date Mar 19, 2022
 */
public class AddressDTO {
	
	private Integer id ;
	private Integer userid ;
	private  String street;
	private  String state;
	private  String country;
	private  String pincode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", userid=" + userid + ", street=" + street + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + "]"+"\r";
	}
	
	

}
