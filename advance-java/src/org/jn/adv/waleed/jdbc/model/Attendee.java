package org.jn.adv.waleed.jdbc.model;

import java.time.LocalDate;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class Attendee {
	
	private Integer attendeeId;
	private String  firstName ;
	private String  phone;
	private String  email;
	private String vip;
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
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	@Override
	public String toString() {
		return "Attendee [attendeeId=" + attendeeId + ", firstName=" + firstName + ", phone=" + phone + ", email="
				+ email + ", vip=" + vip + "]";
	}
	
	
	
	
	
	

}
