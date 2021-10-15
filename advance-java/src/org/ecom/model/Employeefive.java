package org.ecom.model;

import java.io.Serializable;
import java.util.Date;

public class Employeefive implements Serializable {

	private static final long serialVersionUID = -1443814004539007341L;

	//

	private int id;
	private String name;
	private Date dob;
	private Date joined_date;
	private Date create_date;
	private Date update_date;
	private Date release_date;	
	private int notice_period;
	private String emailid;
	private boolean gender;

	public Employeefive() {
	}

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

	public Date getJoined_date() {
		return joined_date;
	}

	public void setJoined_date(Date joined_date) {
		this.joined_date = joined_date;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "id: "+id +"   name: "+ name+" dob: "+dob
				+"   joined_date: "+joined_date+"  create_date: "+create_date + "  update_date: "+update_date+"  notice_period: "+notice_period+"  gender: "+gender;

	}
}
