package org.la.core.java.student.wang.assignment8;

public class Categories {
    /*
17.	Create a class Categorys having member variables id, categoryName, thumbnails. create getters and 
	setters for all member variables. Create object of Categorys class in other class inside main method and set all member values and print all member values using getters.
	*/
    private int id;
    private String categoryName;
    private boolean thumbnails;

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

    public boolean isThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(boolean thumbnails) {
        this.thumbnails = thumbnails;
    }
}
