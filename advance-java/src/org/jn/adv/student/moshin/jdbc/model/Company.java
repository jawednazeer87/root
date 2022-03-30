package org.jn.adv.student.moshin.jdbc.model;
public class Company {
	private Integer id;
	private String companyName ;
	private String founderName;
	private String registrationNum;
	private Double yearlyTurnover;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getFounderName() {
		return founderName;
	}
	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}

	public String getRegistrationNum() {
		return registrationNum;
	}
	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum;
		
	}

	
	public Double getYearlyTurnover() {
		return yearlyTurnover;
	}
	public void setYearlyTurnover(Double yearlyTurnover) {
		this.yearlyTurnover = yearlyTurnover;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", founderName=" + founderName
				+ ", registrationNum=" + registrationNum + ", yearlyTurnover=" + yearlyTurnover + "]"+"\r";
	}
	
	
	

}
