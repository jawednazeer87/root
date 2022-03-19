package org.jn.adv.jawed.jdbc.model;

import java.io.Serializable;


//POJO - Plain Old Java Object
public class Company implements Serializable{

	private static final long serialVersionUID = -1443814004539007341L;
	
	private Integer id;
	private Integer companyName;
	private String founderName;
	private String registrationNum;
	private Double yearlyTurnover;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the companyName
	 */
	public Integer getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(Integer companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the founderName
	 */
	public String getFounderName() {
		return founderName;
	}
	/**
	 * @param founderName the founderName to set
	 */
	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}
	/**
	 * @return the registrationNum
	 */
	public String getRegistrationNum() {
		return registrationNum;
	}
	/**
	 * @param registrationNum the registrationNum to set
	 */
	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum;
	}
	/**
	 * @return the yearlyTurnover
	 */
	public Double getYearlyTurnover() {
		return yearlyTurnover;
	}
	/**
	 * @param yearlyTurnover the yearlyTurnover to set
	 */
	public void setYearlyTurnover(Double yearlyTurnover) {
		this.yearlyTurnover = yearlyTurnover;
	}
	@Override
	public String toString() {
		return "{id: " + id + ", companyName: " + companyName + ", founderName: " + founderName
				+ ", registrationNum: " + registrationNum + ", yearlyTurnover: " + yearlyTurnover + "}";
	}

}