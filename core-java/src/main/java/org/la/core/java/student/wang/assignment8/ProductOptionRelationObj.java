package org.la.core.java.student.wang.assignment8;

public class ProductOptionRelationObj {
    public static void main(String[] args) {
        ProductOptionRelation productOptionRelation = new ProductOptionRelation();
        productOptionRelation.setProductId(1);
        productOptionRelation.setOptionId(2);

        System.out.println("productOptionRelation.getProductId() = " + productOptionRelation.getProductId());
        System.out.println("productOptionRelation.getOptionId() = " + productOptionRelation.getOptionId());
    }
}
