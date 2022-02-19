package org.la.core.java.student.majeed.assignment8;

/*
21.	Create a class Product having member variables id, productName, description, baseRelationTable, patternId. 
create getters and setters for all member variables. Create object of Product class in other class inside main 
method and set all member values and print all member values using getters.
*/

public class ProductMain {
    public static void main(String[] args) {	
    Product product = new Product();

    product.setId(501);
    product.setProductName("CAR");
    product.setDescription("COROLLA");
    product.setPatternId(502);

    System.out.println("Id = " + product.getId());
    System.out.println("ProductName = " + product.getProductName());
    System.out.println("Description = " + product.getDescription());
    System.out.println("PatternId = " + product.getPatternId());
}	
}
