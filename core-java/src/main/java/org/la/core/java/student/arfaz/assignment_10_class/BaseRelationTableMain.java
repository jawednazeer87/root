	package org.la.core.java.student.arfaz.assignment_10_class;

public class BaseRelationTableMain {

	public static void main(String[] args) {
		BaseRelationTable  comp = new BaseRelationTable();
//		id, brandsId, categoryId, collectionId
		comp.setId(0);
		comp.setBrandsId("12");
		comp.setCategoryId(345);
		comp.setCollectionId(3456);
		System.out.println(comp.getId());
		System.out.println(comp.getBrandsId());
		System.out.println(comp.getCategoryId());
		System.out.println(comp.getCollectionId());
	}

}
