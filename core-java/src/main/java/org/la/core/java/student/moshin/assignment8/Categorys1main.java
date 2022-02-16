package org.la.core.java.student.moshin.assignment8;

public class Categorys1main {
	
	public static void main(String[] args) {
		Categorys1 categories = new Categorys1();
        categories.setId(1);
        categories.setCategoryName("Vivo");
        categories.setThumbnails(true);

        System.out.println("categories.getId() = " + categories.getId());
        System.out.println("categories.getCategoryName() = " + categories.getCategoryName());
        System.out.println("categories.isThumbnails() = " + categories.isThumbnails());
    }
}
