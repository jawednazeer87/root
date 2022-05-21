package org.jn.adv.student.tanseer.jdbc.model;

import java.io.Serializable;

public class City implements Serializable
{
	private static final long serialVersionUID = -1443814004539007341L;
	private Integer id;
	private String city;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
		return "City [ID = "+id+ ", City = "+city+"]"+"\n";
	}
}
