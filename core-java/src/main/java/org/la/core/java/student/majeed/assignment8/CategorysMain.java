package org.la.core.java.student.majeed.assignment8;

/*
17.	Create a class Categorys having member variables id, categoryName, thumbnails. create getters and 
	setters for all member variables. Create object of Categorys class in other class inside main method and set all member values and print all member values using getters.
 */

public class CategorysMain {
    public static void main(String[] args) {
    	Categorys categorys = new Categorys();
    	categorys.setId(1);
    	categorys.setCategoryName("LAPTOP");
    	categorys.setThumbnails("HP");

        System.out.println("Id = " + categorys.getId());
        System.out.println("Category Name = " + categorys.getCategoryName());
        System.out.println("Thumbnails = " + categorys.isThumbnails());
    }	
}
