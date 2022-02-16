package org.la.core.java.student.moshin.assignment8;

import java.time.LocalDate;

public class Products1main {
	
	 public static void main(String[] args) {
		 	Products1 products = new Products1();
	        products.setId(1);
	        products.setMerchantId(1);
	        products.setName("Vivo");
	        products.setPrice(15000);
	        products.setStatus(10);
	        products.setCreatedAt(LocalDate.of(2022,2,12));

	        System.out.println("products.getId() = " + products.getId());
	        System.out.println("products.getMerchantId() = " + products.getMerchantId());
	        System.out.println("products.getName() = " + products.getName());
	        System.out.println("products.getPrice() = " + products.getPrice());
	        System.out.println("products.getStatus() = " + products.getStatus());
	        System.out.println("products.getCreatedAt() = " + products.getCreatedAt());

	    }
	}
