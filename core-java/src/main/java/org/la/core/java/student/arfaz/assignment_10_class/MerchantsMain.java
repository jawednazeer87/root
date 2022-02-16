package org.la.core.java.student.arfaz.assignment_10_class;

public class MerchantsMain {

	public static void main(String[] args) {
		Merchants pob = new Merchants(); 
//		id, merchantName, adminId, countryCode, createdAt
		pob.setId(1);
	pob.setMerchantName("Arfaz");
	pob.setAdminId("23");
	pob.setCountryCode("516510");
	pob.setCreatedAt("Nandalur");
		System.out.println(pob.getId());
		System.out.println(pob.getMerchantName());
		System.out.println(pob.getCountryCode());
		System.out.println(pob.getCreatedAt());
		
	}

}
