package org.jn.core.java.student.shoaeeb.jdbc.model;

public class Categorys {
	private int id;
	private String categoryName;
	private String thumbnails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}
	@Override
	public String toString() {
		return "Categorys [id=" + id + ", categoryName=" + categoryName + ", thumbnails=" + thumbnails + "]";
	}
	
	
}
