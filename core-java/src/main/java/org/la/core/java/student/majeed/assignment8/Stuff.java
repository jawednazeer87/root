package org.la.core.java.student.majeed.assignment8;


/*
18.	Create a class Stuff having member variables id, stuffName, thumbnails. create getters and 
	setters for all member variables. Create object of Stuff class in other class inside main method
	and set all member values and print all member values using getters.
	 */

public class Stuff {
	
    private int id;
    private String stuffName;
    private String thumbnails;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuffName() {
		return stuffName;
	}
	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
	}
	public String getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}
}
