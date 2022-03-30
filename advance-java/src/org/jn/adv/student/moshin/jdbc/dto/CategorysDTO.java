package org.jn.adv.student.moshin.jdbc.dto;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class CategorysDTO {
	private String id;
	private String categroyName;
	private String thumbNails;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategroyName() {
		return categroyName;
	}
	public void setCategroyName(String categroyName) {
		this.categroyName = categroyName;
	}
	public String getThumbNails() {
		return thumbNails;
	}
	public void setThumbNails(String thumbNails) {
		this.thumbNails = thumbNails;
	}
	@Override
	public String toString() {
		return "Categorys [id=" + id + ", categroyName=" + categroyName + ", thumbNails=" + thumbNails + "]";
	}
	
	
	
	
}
