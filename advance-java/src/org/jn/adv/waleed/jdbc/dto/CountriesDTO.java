package org.jn.adv.waleed.jdbc.dto;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class CountriesDTO {
	private String code;
	private String name;
	private String continentName;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
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
		return "Countries [code=" + code + ", name=" + name + ", continentName=" + continentName + "]";
	}
	
	

}
