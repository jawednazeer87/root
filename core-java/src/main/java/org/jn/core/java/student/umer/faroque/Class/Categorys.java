package org.jn.core.java.student.umer.faroque.Class;

public class Categorys {
	private int id;
	private String categoryName;
	private String thumbnails;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setCategoryName(String categoryName)
	{
		this.categoryName=categoryName;
	}
	public void setThumnails(String thumbnails)
	{
		this.thumbnails=thumbnails;
	}
	
	//getters
	public int getId() {
		return id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public String getThumbnails() {
		return thumbnails;
	}
}
