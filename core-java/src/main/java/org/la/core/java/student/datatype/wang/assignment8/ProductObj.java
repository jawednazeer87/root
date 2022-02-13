package org.la.core.java.student.datatype.wang.assignment8;

public class ProductObj {
    public static void main(String[] args) {
        Product product = new Product();

        product.setId(1);
        product.setProductName("banana");
        product.setDescription("fruite");
        product.setPatternId(101);

        System.out.println("product.getId() = " + product.getId());
        System.out.println("product.getProductName() = " + product.getProductName());
        System.out.println("product.getDescription() = " + product.getDescription());
        System.out.println("product.getPatternId() = " + product.getPatternId());
    }
}
