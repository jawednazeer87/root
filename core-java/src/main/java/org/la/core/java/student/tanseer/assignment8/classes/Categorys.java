package org.la.core.java.student.tanseer.assignment8.classes;
/*
 * Create a class Categorys having member variables id, categoryName, thumbnails. create getters 
 * and setters for all member variables. Create object of Categorys class in other class 
 * inside main method and set all member values and print all member values using getters.
 */
public class Categorys 
{
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
	
	public void display()
	{
		System.out.println("ID \t\t"+id);
		System.out.println("CategoryName \t"+categoryName);
		System.out.println("Thumbnails \t"+thumbnails);
	}
}
