package org.la.core.java.student.arfaz.assignment_10_class;

public class ProductsMain {

	public static void main(String[] args) {
		Products pob =  new Products();
		pob.setId(1);
		pob.setMerchantId("1");
		pob.setName("arfaz");
//		id, merchantId, name, price, status, createdAt
    pob.setPrice("Rs.20");
    pob.setStatus("arriving on tomorrow");
    pob.setCreatedAt("Nandalur");
	
		System.out.println(pob.getId());
		System.out.println(pob.getMerchantId());
		System.out.println(pob.getName());
		System.out.println(pob.getPrice());
		System.out.println(pob.getStatus());
		System.out.println("Created at "+pob.getCreatedAt());

	}

}
