package org.la.core.java.student.majeed.assignment8;

/*
19.	Create a class BaseRelationTable having member variables id, brandsId, categoryId, collectionId. 
create getters and setters for all member variables. Create object of BaseRelationTable class in other 
class inside main method and set all member values and print all member values using getters.
	 */

public class BaseRelationTableMain {    
	public static void main(String[] args) {
    BaseRelationTable baseRelationTable = new BaseRelationTable();
    baseRelationTable.setId(1);
    baseRelationTable.setBrandsId(11);
    baseRelationTable.setCategoryId(2);
    baseRelationTable.setCollectionId(10);

    System.out.println("Id = " + baseRelationTable.getId());
    System.out.println("BrandsId = " + baseRelationTable.getBrandsId());
    System.out.println("CategoryId = " + baseRelationTable.getCategoryId());
    System.out.println("CollectionId = " + baseRelationTable.getCollectionId());
}
}
