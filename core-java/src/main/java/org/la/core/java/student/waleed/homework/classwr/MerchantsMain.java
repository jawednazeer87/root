package org.la.core.java.student.waleed.homework.classwr;

import org.la.core.java.student.waleed.homework.classwr.model.Merchants;

/**
 * @author Waleed Rizq
 *
 * @date Feb 6, 2022
 */
public class MerchantsMain {

	
	public static void main(String[] args) {
		
		Merchants merchants = new Merchants();
		merchants.setMerchantId(70111);
		merchants.setMerchantName("Aiman");
		merchants.setAdminId(40055);
		merchants.setCountryCode(01);
		merchants.setCreatedAt("USA");
		System.out.println(" MerchantId : "+merchants.getMerchantId());
		System.out.println(" MerchantName : "+merchants.getMerchantName());
		System.out.println(" AdminId : "+merchants.getAdminId());
		System.out.println(" CountryCode : "+merchants.getCountryCode());
		System.out.println("CreatedAt : "+merchants.getCreatedAt()  );

	}

}
