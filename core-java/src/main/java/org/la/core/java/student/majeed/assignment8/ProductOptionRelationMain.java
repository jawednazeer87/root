package org.la.core.java.student.majeed.assignment8;

import org.la.core.java.student.wang.assignment8.ProductOptionRelation;

/*
22.	Create a class ProductOptionRelation having member variables productId, optionId. 
create getters and setters for all member variables. Create object of ProductOptionRelation class
in other class inside main method and set all member values and print all member values using getters.
*/

public class ProductOptionRelationMain { 
	
	public static void main(String[] args) {
    ProductOptionRelation productOptionRelation = new ProductOptionRelation();
    productOptionRelation.setProductId(777);
    productOptionRelation.setOptionId(1);

    System.out.println("ProductId = " + productOptionRelation.getProductId());
    System.out.println("OptionId = " + productOptionRelation.getOptionId());
}
}
