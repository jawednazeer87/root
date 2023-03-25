package org.jn.core.java.student.shoaeeb.jdbc.model;

import java.util.Date;

public class AeroplaneRouteDomestic {

	private int id;
	private String routeName;
	private Date departureDate;
	private Date arrivalDate;
	private String departureCity;
	private String departureState;
	private String country;
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	private String arrivalCity;
	private String arrivalState;
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
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "AeroplaneRouteDomestic [id=" + id + ", routeName=" + routeName + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + ", departureCity=" + departureCity + ", departureState="
				+ departureState + ", country=" + country + ", arrivalCity=" + arrivalCity + ", arrivalState="
				+ arrivalState + "]";
	}
	
	
	
	
}
