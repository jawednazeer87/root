package org.la.core.java.student.wang.assignment8;

public class BrandsObj {
    public static void main(String[] args) {
        Brands brands = new Brands();
        brands.setId(1);
        brands.setBrandName("apple");
        brands.setThumbnails("Yes");

        System.out.println("brands.getId() = " + brands.getId());
        System.out.println("brands.getBrandName() = " + brands.getBrandName());
        System.out.println("brands.getThumbnails() = " + brands.getThumbnails());
    }
}
