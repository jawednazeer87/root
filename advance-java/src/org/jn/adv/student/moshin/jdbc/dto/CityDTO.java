package org.jn.adv.student.moshin.jdbc.dto;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class CityDTO {

	
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
		return "City [id=" + id + ", city=" + city + "]";
	}
	
}
