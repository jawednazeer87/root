package org.la.core.java.student.majeed.classes.model;

import java.util.Date;

public class Trip {
	private int tripNumber;
	private Date tripDate;
	private String fromStation;
	private String toStation;

	public int getTripNumber() {
		return tripNumber;
	}

	public void setTripNumber(int tripNumber) {
		this.tripNumber = tripNumber;
	}

	public Date getTripDate() {
		return tripDate;
	}

	public void setTripDate(Date tripDate) {
		this.tripDate = tripDate;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public void printTrip() {
		System.out.println("tripNumber : "+tripNumber);
		System.out.println("tripDate : "+tripDate);
		System.out.println("fromStation : "+fromStation);
		System.out.println("toStation : "+toStation);
	}
}
