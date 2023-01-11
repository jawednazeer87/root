package org.jn.core.java.student.shoaeeb.absclss;

public abstract class AttendeeAbsClass {
	int attendeeId;
	String firstName;
	String lastName;
	long phone;
	String email;
	String vip;
	
	//setters
	public abstract void setAttendeeId(int attendeeId);
	public abstract void setFirstName(String firstName);
	public abstract void setLastName(String lastName);
	public abstract void setPhone(long phone);
	public abstract void setEmail(String email);
	public abstract void setVip(String vip);
	
	//getters
	public abstract int getAttendeeId();
	public abstract String getFirstName();
	public abstract String getLastName();
	public abstract long getPhone();
	public abstract String getEmail();
	public abstract String getVip();
	
}
