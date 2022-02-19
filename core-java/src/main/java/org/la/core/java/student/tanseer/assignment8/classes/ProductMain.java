package org.la.core.java.student.tanseer.assignment8.classes;

public class ProductMain 
{
	public static void main(String[] args) 
	{
		Product product = new Product();
		product.setId(1221);
		product.setDescription("Valid Product");
		product.setProductName("Cinthol");
		product.setBaseRelationTable("InterRealted");
		product.display();
	}
}
