package org.la.core.java.student.majeed.assignment8;


/*
16.	Create a class Brands having member variables id, brandName, thumbnails. create getters and 
	setters for all member variables. Create object of Brands class in other class inside main method
	and set all member values and print all member values using getters.
 */

public class Brands {
	
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
}
