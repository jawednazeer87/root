package org.la.core.java.student.nizaam.jdbc.model;

public class Attendee {

	private int attendee_id;
	private String first_name;
	private String last_name;
	private int phone;
	private String email;
	private boolean vip;
	
	Attendee(){}
	public Attendee(int attendeeId, String firstName, String lastName, int phone, String email, boolean vip){
		this.attendee_id = attendeeId;
		this.first_name = firstName;
		this.last_name = lastName;
		this.phone = phone;
		this.email = email;
		this.vip = vip;
	}
	
	public int getAttendeeId() {
		return attendee_id;
	}
	public String getFirstName() {
		return first_name;
	}
	public String getLastName() {
		return last_name;
	}
	public int getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public boolean isVip() {
		return vip;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Attendee{" +
                "attendeeId=" + attendee_id +
                ", firstName='" + first_name + '\'' +
                ", lastName='" + last_name + '\'' +
                ", phone='" + phone +'\''+
                ", email ='"+ email + '\''+
                ", vip ='" + vip +
                
                '}';
	}
}
