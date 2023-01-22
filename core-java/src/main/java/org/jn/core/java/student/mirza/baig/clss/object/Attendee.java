package org.jn.core.java.student.mirza.baig.clss.object;

public class Attendee {

	private int attendeeId;
	private String firstName;
	private String lastName;
	private long phone;
	private String email;
	private String vip;
	public int getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(int attendeeId) {
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long l) {
		this.phone = l;
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
	
	
	
	
}


//Create a class Attendee having member variables attendeeId, firstName, lastName, phone, email, vip. 
//create getters and setters for all member variables. Create object of Attendee class in other 
//class inside main method and set all member values and print all member values using getters.