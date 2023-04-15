package org.jn.core.java.student.shoaeeb.jdbc.dto;

public class CityDto {
	private int id;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", city=" + city + "]";
	}
}
