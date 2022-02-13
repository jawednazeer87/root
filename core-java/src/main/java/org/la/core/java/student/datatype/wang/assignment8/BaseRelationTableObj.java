package org.la.core.java.student.datatype.wang.assignment8;

public class BaseRelationTableObj {
    public static void main(String[] args) {
        BaseRelationTable baseRelationTable = new BaseRelationTable();
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
