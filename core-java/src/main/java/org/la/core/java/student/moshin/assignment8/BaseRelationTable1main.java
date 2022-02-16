package org.la.core.java.student.moshin.assignment8;

public class BaseRelationTable1main {
	
	public static void main(String[] args) {
		BaseRelationTable1 baseRelationTable = new BaseRelationTable1();
        baseRelationTable.setId(1);
        baseRelationTable.setBrandsId(1);
        baseRelationTable.setCategoryId(1);
        baseRelationTable.setCollectionId(1);

        System.out.println("baseRelationTable.getId() = " + baseRelationTable.getId());
        System.out.println("baseRelationTable.getBrandsId() = " + baseRelationTable.getBrandsId());
        System.out.println("baseRelationTable.getCategoryId() = " + baseRelationTable.getCategoryId());
        System.out.println("baseRelationTable.getCollectionId() = " + baseRelationTable.getCollectionId());
    }
}
