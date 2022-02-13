package org.la.core.java.student.datatype.wang.assignment8;

public class Stuff {
    /*
    18.	Create a class Stuff having member variables id, stuffName, thumbnails. create getters and
		setters for all member variables. Create object of Stuff class in other class inside main method
		and set all member values and print all member values using getters.
     */

    private int id;
    private String stuffName;
    private boolean thumbnails;

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

    public boolean isThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(boolean thumbnails) {
        this.thumbnails = thumbnails;
    }
}
