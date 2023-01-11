package org.jn.core.java.student.shoaeeb.absclss;

public class ProductsAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductsAbsClass abs = new ProductsAbsClassImpl();
		abs.setId(1);
		abs.setMerchantId(5);
		abs.setName("john");
		abs.setPrice(6000);
		abs.setStatus("online");
	
		System.out.println("Id: "+abs.getId()+" Merchant Id: "+abs.getMerchantId()+" Name: "+abs.getName()+" price: "+abs.getPrice()+" Status: "+abs.getStatus());
	}

}
