package org.jn.core.java.student.mirza.jdbc.model;

public class Company {
	
	private int CompanyId;
	private String Name;
	private String Description;
	private int PrimaryContactAttendeeId;
	
	public Company() {}

	public int getCompanyId() {
		return CompanyId;
	}

	public void setCompanyId(int companyId) {
		CompanyId = companyId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getPrimaryContactAttendeeId() {
		return PrimaryContactAttendeeId;
	}

	public void setPrimaryContactAttendeeId(int primaryContactAttendeeId) {
		PrimaryContactAttendeeId = primaryContactAttendeeId;
	}

	@Override
	public String toString() {
		return " {CompanyId=" + CompanyId + ", Name=" + Name + ", Description=" + Description
				+ ", PrimaryContactAttendeeId=" + PrimaryContactAttendeeId + "}";
	}
	
	
}
