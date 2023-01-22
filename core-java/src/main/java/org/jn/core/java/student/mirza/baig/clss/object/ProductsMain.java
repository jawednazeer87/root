package org.jn.core.java.student.mirza.baig.clss.object;

import java.util.Date;

public class ProductsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Products p1 = new Products();
     Date d= new Date();
     
     p1.setMerchantId(102);
     p1.setName("mirza");
     p1.setPrice(25000.20);
     p1.setStatus("diliverd");
     p1.setCreatedAt(d);
     
     System.out.println("Merchant id  :"+p1.getMerchantId());
     System.out.println("name :" +p1.getName());
     System.out.println("Price : "+p1.getPrice());
     System.out.println("Status :"+p1.getStatus());
     System.out.println("created date :"+p1.getCreatedAt());
	}
	

}
