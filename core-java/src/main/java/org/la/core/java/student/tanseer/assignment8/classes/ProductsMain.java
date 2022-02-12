package org.la.core.java.student.tanseer.assignment8.classes;

public class ProductsMain 
{
	public static void main(String[] args) 
	{
		Products products = new Products();
		products.setId(1010);
		products.setMerchantId(122);
		products.setName("Alex");
		products.setPrice(1200);
		products.setStatus("Approved");
		products.setCreatedAt("India");
		products.display();
		
	}
}
