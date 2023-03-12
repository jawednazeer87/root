package org.jn.core.java.student.naushad.jdbc.model.dto;

import java.util.Date;

public class AeroplaneRouteDomesticDto {
	private int id;
	private String route_name;
	private Date departure_date;
	private Date arrival_date;
	private String departure_city;
	private String departure_state;
	private String arrival_city;
	private String arrival_state;
	private String country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoute_name() {
		return route_name;
	}

	public void setRoute_name(String route_name) {
		this.route_name = route_name;
	}

	public Date getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}

	public Date getArrival_date() {
		return arrival_date;
	}

	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}

	public String getDeparture_city() {
		return departure_city;
	}

	public void setDeparture_city(String departure_city) {
		this.departure_city = departure_city;
	}

	public String getDeparture_state() {
		return departure_state;
	}

	public void setDeparture_state(String departure_state) {
		this.departure_state = departure_state;
	}

	public String getArrival_city() {
		return arrival_city;
	}

	public void setArrival_city(String arrival_city) {
		this.arrival_city = arrival_city;
	}

	public String getArrival_state() {
		return arrival_state;
	}

	public void setArrival_state(String arrival_state) {
		this.arrival_state = arrival_state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "AeroplaneRouteDomesticDto [id=" + id + ", route_name=" + route_name + ", departure_date="
				+ departure_date + ", arrival_date=" + arrival_date + ", departure_city=" + departure_city
				+ ", departure_state=" + departure_state + ", arrival_city=" + arrival_city + ", arrival_state="
				+ arrival_state + ", country=" + country + "]";
	}

}
