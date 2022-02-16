package org.la.core.java.student.moshin.assignment8;

public class Product1main {
	
	public static void main(String[] args) {
        Product1 product = new Product1();

        product.setId(1);
        product.setProductName("paper boat");
        product.setDescription("Juice");
        product.setPatternId(101);

        System.out.println("product.getId() = " + product.getId());
        System.out.println("product.getProductName() = " + product.getProductName());
        System.out.println("product.getDescription() = " + product.getDescription());
        System.out.println("product.getPatternId() = " + product.getPatternId());
    }
}
