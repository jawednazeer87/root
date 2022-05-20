package org.jn.adv.student.majeed.jdbc.model;

/**
* @author AbdulMajeed
*
*/

public class Attendee {

	private Integer attendeeId;
	private String  firstName;
	private String  lastName;
	private String  phone;
	private String  email;
	private Integer vip;
	
	public Integer getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(Integer attendeeId) {
		this.attendeeId = attendeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getVip() {
		return vip;
	}
	public void setVip(Integer vip) {
		this.vip = vip;
	}
	
	@Override
	public String toString() {
		return "{attendeeId: " + attendeeId + ", firstName: " + firstName + ", lastName: " + lastName + ", phone: " + phone
				+ ", email: " + email + ", vip: " + vip + "}";
	}		
}
