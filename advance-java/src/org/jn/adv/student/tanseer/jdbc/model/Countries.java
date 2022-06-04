package org.jn.adv.student.tanseer.jdbc.model;

import java.io.Serializable;

public class Countries implements Serializable
{
	private static final long serialVersionUID = -1443814004539007341L;
	private Integer code;
	private String name;
	private String continentName;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	
	@Override
	public String toString() {
		return "Country [ Code = "+code+", Name = "+name+", Continent Name = "+continentName+"]"+"\n";
	}
	
}
