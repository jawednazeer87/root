package org.jn.core.java.student.shoaeeb.jdbc.dto;

public class BrandsDto {

	private int id;
	private String brandName;
	private String thumbnails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}
	@Override
	public String toString() {
		return "Brands [id=" + id + ", brandName=" + brandName + ", thumbnails=" + thumbnails + "]";
	}
}
