package org.jn.adv.student.moshin.jdbc.dto;

public class CompanyDTO {
	private Integer companyId;
	private String Name;
	private String description;
	private Integer primary_contact_attendee_id;

	/**
	 * @return the companyId
	 */
	public Integer getCompanyId() {
		return companyId;
	}

	/**
	 * companyId the companyId to set
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}


	/**
	 * @return the Name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * name the name to set
	 */
	public void setName(String name) {
		this.Name = name;
	}

	

	/**
	 * @return the Description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Description the Description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	/**
	 * @return the primary_contact_attendee_id
	 */
	public Integer getPrimary_contact_attendee_id() {
		return primary_contact_attendee_id;
	}
	
	/**
	 * primary_contact_attendee_id the primary_contact_attendee_id to set
	 */
	public void setPrimary_contact_attendee_id(Integer primary_contact_attendee_id) {
		this.primary_contact_attendee_id = primary_contact_attendee_id;
	}

	@Override
	public String toString() {
		return "{companyId: "+companyId+", Name: "+Name+", description: "+description+", primary_contact_attendee_id:  "+primary_contact_attendee_id+ 
				",}";
	}
}