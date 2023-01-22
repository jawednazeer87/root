package org.jn.core.java.student.mirza.baig.clss.object;

import java.util.Date;



public class MerchantsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Merchants m = new Merchants();
		Date date = new Date();
		m.setMerchantName("xyz services");
		m.setAdminId(1001);
		m.setCountryCode("IND");
		m.setCreatedAt(date);
		
		System.out.println("Merchants name  :"+m.getMerchantName() );
		System.out.println("admin id   :"+m.getAdminId());
		System.out.println("Country code : "+m.getCountryCode());
		System.out.println("Created at  :"+m.getCreatedAt());
	}

}
