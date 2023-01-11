package org.jn.core.java.student.shoaeeb.absclss;

public class AttendeeAbsClassImpl extends AttendeeAbsClass {

	@Override
	public void setAttendeeId(int attendeeId) {
		// TODO Auto-generated method stub
		this.attendeeId=attendeeId;
		
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName=firstName;
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName= lastName;
	}

	@Override
	public void setPhone(long phone) {
		// TODO Auto-generated method stub
		this.phone=phone;
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email=email;
	}

	@Override
	public void setVip(String vip) {
		// TODO Auto-generated method stub
		this.vip=vip;
	}

	@Override
	public int getAttendeeId() {
		// TODO Auto-generated method stub
		return this.attendeeId;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}

	@Override
	public long getPhone() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public String getVip() {
		// TODO Auto-generated method stub
		return this.vip;
	}

}
