package org.la.core.java.student.arfaz.assignment_10_class;

public class ProductMain {

	public static void main(String[] args) {
		Product pob =  new Product();
//		id, productName, description, baseRelationTable, patternId
		pob.setId(1);
	pob.setProductName("Butter");
	pob.setDescription("This is a Product");
	pob.setBaseRelationTable("Table");
	pob.setPatternId("123456");
	System.out.println(pob.getId());
	System.out.println(pob.getProductName());
	System.out.println(pob.getDescription());
	System.out.println(pob.getBaseRelationTable());
	System.out.println(pob.getPatternId());
	}

}
