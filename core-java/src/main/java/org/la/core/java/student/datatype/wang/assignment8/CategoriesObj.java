package org.la.core.java.student.datatype.wang.assignment8;

public class CategoriesObj {
    public static void main(String[] args) {
        Categories categories = new Categories();
        categories.setId(1);
        categories.setCategoryName("apple");
        categories.setThumbnails(false);

        System.out.println("categories.getId() = " + categories.getId());
        System.out.println("categories.getCategoryName() = " + categories.getCategoryName());
        System.out.println("categories.isThumbnails() = " + categories.isThumbnails());
    }
}
