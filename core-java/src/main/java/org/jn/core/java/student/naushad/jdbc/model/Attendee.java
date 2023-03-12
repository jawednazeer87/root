package org.jn.core.java.student.naushad.jdbc.model;

import java.util.Objects;

public class Attendee {
	private int attendee_id;
	private String first_name;
	private String last_name;
	private long phn_no;
	private String eamil;
	private boolean vip;

	public int getAttendee_id() {
		return attendee_id;
	}

	public void setAttendee_id(int attendee_id) {
		this.attendee_id = attendee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public long getPhn_no() {
		return phn_no;
	}

	public void setPhn_no(long phn_no) {
		this.phn_no = phn_no;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public String toString() {
		return "Attendee [attendee_id=" + attendee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", phn_no=" + phn_no + ", eamil=" + eamil + ", vip=" + vip + "]";
	}

	public int hashCode() {
		return Objects.hash(attendee_id, eamil, first_name, last_name, phn_no, vip);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attendee other = (Attendee) obj;
		return attendee_id == other.attendee_id && Objects.equals(eamil, other.eamil)
				&& Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name)
				&& Objects.equals(phn_no, other.phn_no) && Objects.equals(vip, other.vip);
	}


	public Attendee(int attendee_id, String first_name, String last_name, long phn_no, String eamil, boolean vip) {
		super();
		this.attendee_id = attendee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phn_no = phn_no;
		this.eamil = eamil;
		this.vip = vip;
	}

	public Attendee() {
	}
}
