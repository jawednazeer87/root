package org.jn.adv.student.moshin.jdbc.dto;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class BrandsDTO {
	private String id;
	private String brandName;
	private String thumbNails;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getThumbNails() {
		return thumbNails;
	}
	public void setThumbNails(String thumbNails) {
		this.thumbNails = thumbNails;
	}
	@Override
	public String toString() {
		return "Brands [id=" + id + ", brandName=" + brandName + ", thumbNails=" + thumbNails + "]";
	}
	
}
