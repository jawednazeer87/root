package org.la.core.java.student.nizaam.jdbc.model;

public class Company {

	private int company_id;
	private String name;
	private String description;
	private int primary_contact_attendee_id;
	
	Company(){}
	public Company(int companyId, String name, String description, int primaryContactAttendeeId){
		this.company_id = companyId;
		this.name = name;
		this.description = description;
		this.primary_contact_attendee_id = primaryContactAttendeeId;
	}
	
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
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
	public int getPrimary_contact_attendee_id() {
		return primary_contact_attendee_id;
	}
	public void setPrimary_contact_attendee_id(int primary_contact_attendee_id) {
		this.primary_contact_attendee_id = primary_contact_attendee_id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Company{" +
        "CompanyId=" + company_id +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", primayContactAttendee Id = '" + primary_contact_attendee_id + '\''+
       
        '}';
	}
}
