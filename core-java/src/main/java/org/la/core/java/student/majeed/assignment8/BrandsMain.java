package org.la.core.java.student.majeed.assignment8;

/*
16.	Create a class Brands having member variables id, brandName, thumbnails. create getters and 
	setters for all member variables. Create object of Brands class in other class inside main method
	and set all member values and print all member values using getters.
 */

public class BrandsMain {
    public static void main(String[] args) {
        Brands brands = new Brands();
        brands.setId(101);
        brands.setBrandName("INFOSYS");
        brands.setThumbnails("ACTIVE");

        System.out.println("Id = " + brands.getId());
        System.out.println("Brand Name = " + brands.getBrandName());
        System.out.println("Thumbnails = " + brands.getThumbnails());
    }	
}
