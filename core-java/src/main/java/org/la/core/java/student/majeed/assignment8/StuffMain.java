package org.la.core.java.student.majeed.assignment8;

/*
18.	Create a class Stuff having member variables id, stuffName, thumbnails. create getters and 
	setters for all member variables. Create object of Stuff class in other class inside main method
	and set all member values and print all member values using getters.
	 */

public class StuffMain {    
	public static void main(String[] args) {

    Stuff stuff = new Stuff();
    stuff.setId(1);
    stuff.setStuffName("FRUIT");
    stuff.setThumbnails("MANGO");

    System.out.println("Id = " + stuff.getId());
    System.out.println("StuffName = " + stuff.getStuffName());
    System.out.println("Thumbnails = " + stuff.getThumbnails());

}
}
