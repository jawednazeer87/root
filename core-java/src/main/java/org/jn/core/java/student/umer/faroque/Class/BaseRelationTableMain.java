package org.jn.core.java.student.umer.faroque.Class;

public class BaseRelationTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseRelationTable bs = new BaseRelationTable();
		bs.setId(1);
		bs.setBrandsId(5);
		bs.setCategoryId(6);
		bs.setCollectionId(8);
		
		System.out.println("Id: "+bs.getId()+" Brands Id: "+bs.getBrandsId()+" Category Id: "+bs.getCategoryId()+" Collection Id: "+bs.getCollectionId());
	}

}
