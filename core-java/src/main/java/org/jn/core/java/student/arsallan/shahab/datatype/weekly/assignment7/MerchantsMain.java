package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class MerchantsMain {

	public static void main(String[] args) {
		
		Merchants m = new Merchants();
		
		m.setAdminId(123);
		m.setCountryCode(456);
		m.setCreatedAt("1-1-101");
		m.setId(789);
		m.setMerchantName("merchant");
		
		System.out.println("Merchants [id=" + m.getId() + ", merchantName=" + m.getMerchantName() + ", adminId=" + m.getAdminId() + ", countryCode="
				+ m.getCountryCode() + ", createdAt=" + m.getCreatedAt() + "]");
		
	}

}
