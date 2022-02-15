package org.la.core.java.student.majeed.assignment8;

/*
14.	Create a class Products having member variables id, merchantId, name, price, status, createdAt. 
create getters and setters for all member variables. Create object of Products class in other class 
inside main method and set all member values and print all member values using getters.
 */

public class ProductsMain {
	
    public static void main(String[] args) {
        Products products = new Products();
        products.setId(101);
        products.setMerchantId(201);
        products.setName("India Inc");
        products.setPrice(500);
        products.setStatus("Active");
        products.setCreatedAt("India");

        System.out.println(products.getId());
        System.out.println(products.getMerchantId());
        System.out.println(products.getName());
        System.out.println(products.getPrice());
        System.out.println(products.getStatus());
        System.out.println(products.getCreatedAt());

    }	
    		
}
