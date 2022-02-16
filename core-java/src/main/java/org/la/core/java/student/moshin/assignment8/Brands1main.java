package org.la.core.java.student.moshin.assignment8;

public class Brands1main {
	
	public static void main(String[] args) {
        Brands1 brands = new Brands1();
        brands.setId(1);
        brands.setBrandName("Vivo");
        brands.setThumbnails("Yes");

        System.out.println("brands.getId() = " + brands.getId());
        System.out.println("brands.getBrandName() = " + brands.getBrandName());
        System.out.println("brands.getThumbnails() = " + brands.getThumbnails());
    }
}
