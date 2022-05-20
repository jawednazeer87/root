package org.jn.adv.student.moshin.jdbc.model;

public class Attendee {

	private Integer attendee_id;
	private String firstName;
	private String lastName;
	private Integer phone;
	private String email;
	private Integer vip;
	

	/**
	 * @return the attendee_id
	 */
	public Integer getAttendee_id() {
		return attendee_id;
	}

	/**
	 * @param attendee_id the attendee_id to set
	 */
	public void setAttendee_id(Integer attendee_id) {
		this.attendee_id = attendee_id;
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
	 * @return the phone
	 */
	public Integer getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the vip
	 */
	public Integer getVip() {
		return vip;
	}

	/**
	 * @param vip the vip to set
	 */
	public void setVip(Integer vip) {
		this.vip = vip;
	}

	
	@Override
	public String toString() {
		
		return "{attendee_id: "+attendee_id+", firstName: "+firstName+", lastName: "+lastName+", phone:  "+phone+ 
				", email: "+email+ ", vip: "+vip+"}";
	}
}