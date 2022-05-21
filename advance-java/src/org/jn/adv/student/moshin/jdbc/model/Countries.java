package org.jn.adv.student.moshin.jdbc.model;

import java.time.LocalDate;
public class Countries {

	private Integer code;
	private String name;
	private String continent_name;


	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the continent_name
	 */
	public String getContinent_name() {
		return continent_name;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setContinent_name(String continent_name) {
		this.continent_name = continent_name;
	}

	@Override
	public String toString() {
		return "{code: "+code+", name: "+name+", continent_name: "+continent_name+"}";
	}

}
