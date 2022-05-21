package org.jn.adv.student.moshin.jdbc.dto;

import java.time.LocalDate;
import java.time.Period;

public class BrandsDTO {

	private Integer id;
	private String brand_name;
	private String thumbnails;


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	

	/**
	 * @return the brand_name
	 */
	public String getBrand_name() {
		return brand_name;
	}

	/**
	 * @param brand_name the brand_name to set
	 */
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	/**
	 * @return the thumbnails
	 */
	public String getThumbnails() {
		return thumbnails;
	}

	/**
	 * @param thumbnails the thumbnails to set
	 */
	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}

	@Override
	public String toString() {
		return "{id: "+id+", brand_name: "+brand_name+", thumbnails: "+thumbnails+"}";
	}

}
