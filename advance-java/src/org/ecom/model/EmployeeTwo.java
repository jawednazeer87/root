package org.ecom.model;

import java.io.Serializable;
import java.util.Date;

public class EmployeeTwo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private Date dob;
	private String email;
	private boolean gender;
	private Date joined_date;
	private Date release_date;
	private int notice_period;
	
	public EmployeeTwo() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getJoined_date() {
		return joined_date;
	}

	public void setJoined_date(Date joined_date) {
		this.joined_date = joined_date;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public int getNotice_period() {
		return notice_period;
	}

	public void setNotice_period(int notice_period) {
		this.notice_period = notice_period;	
	}
	
	@Override
	public String toString() {
		return "id: "+id +"   name: "+ name+" dob: "+dob
				+"email: "+email +"   joined_date: "+joined_date+" notice_period: "+notice_period+"  gender: "+gender;

	}
}
