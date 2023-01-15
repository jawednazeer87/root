package org.jn.core.java.student.umer.faroque.Class;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pr= new Product();
		pr.setId(1);
		pr.setName("product name");
		pr.setBaseRelationTable("baseRelationTable");
		pr.setDescription("descrption");
		pr.setPatternId(5);
		
		System.out.println("Id: "+pr.getId()+" Product Name: "+pr.getProductName()+" Base Relation Table "+pr.getBaseRelationTable()+" Description: "+pr.getDescription()+" Pattern Id: "+pr.getPatternId());
	}

}
