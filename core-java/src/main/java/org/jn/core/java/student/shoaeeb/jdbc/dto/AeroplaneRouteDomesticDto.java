package org.jn.core.java.student.shoaeeb.jdbc.dto;

import java.util.Date;

public class AeroplaneRouteDomesticDto {

	
	private int id;
	private String routeName;
	private Date departureDate;
	private Date arrivalDate;
	private String departureCity;

	private String departureState;
	private String arrivalCity;
	private String arrivalState;
	private String country;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureState() {
		return departureState;
	}
	public void setDepartureState(String departureState) {
		this.departureState = departureState;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getArrivalState() {
		return arrivalState;
	}
	public void setArrivalState(String arrivalState) {
		this.arrivalState = arrivalState;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	@Override
	public String toString() {
		return "AeroplaneRouteDomesticDto [id=" + id + ", routeName=" + routeName + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + ", departureCity=" + departureCity + ", departureState="
				+ departureState + ", arrivalCity=" + arrivalCity + ", arrivalState=" + arrivalState + ", country="
				+ country + "]";
	}
	
	
	
	
}
