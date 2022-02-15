package org.la.core.java.student.majeed.assignment8;

/*
13.	Create a class Merchants having member variables id, merchantName, adminId, countryCode, createdAt. 
create getters and setters for all member variables. Create object of Merchants class in other class 
inside main method and set all member values and print all member values using getters.
 */

public class MerchantsMain { 
	
	public static void main(String[] args) {
		
    Merchants merchants = new Merchants();
    
    merchants.setId(1);
    merchants.setMerchantName("India Inc");
    merchants.setAdminId(101);
    merchants.setCountryCode(10);
    merchants.setCreatedAt("India");

    System.out.println(merchants.getId());
    System.out.println(merchants.getMerchantName());
    System.out.println(merchants.getAdminId());
    System.out.println(merchants.getCountryCode());
    System.out.println(merchants.getCreatedAt());

	}
		
}
