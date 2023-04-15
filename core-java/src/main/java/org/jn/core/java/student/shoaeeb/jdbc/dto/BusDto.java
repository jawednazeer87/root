package org.jn.core.java.student.shoaeeb.jdbc.dto;

public class BusDto {

	private int id;
	private String routeName;
	private String busNum;
	private String plateNum;
	private String origin;
	private String destination;
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
	public String getBusNum() {
		return busNum;
	}
	public void setBusNum(String busNum) {
		this.busNum = busNum;
	}
	public String getPlateNum() {
		return plateNum;
	}
	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Bus [id=" + id + ", routeName=" + routeName + ", busNum=" + busNum + ", plateNum=" + plateNum
				+ ", origin=" + origin + ", destination=" + destination + "]";
	}
}
