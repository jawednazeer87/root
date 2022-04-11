package org.jn.adv.student.tanseer.jdbc.model;

import java.io.Serializable;

public class Company implements Serializable
{
	private static final long serialVersionUID = -1443814004539007341L;
	
	private Integer companyId;
	private String name;
	private String description;
	private Integer primaryContact;
	private Integer attendeeId;
	
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(Integer primaryContact) {
		this.primaryContact = primaryContact;
	}
	public Integer getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(Integer attendeeId) {
		this.attendeeId = attendeeId;
	}
	
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", Name=" + name + ", description=" + description +"primary_contact =" +primaryContact+ " attendee_id = "+ attendeeId +"]"+"\n";
	}
	
}
