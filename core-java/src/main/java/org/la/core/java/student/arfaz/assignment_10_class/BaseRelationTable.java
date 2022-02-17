package org.la.core.java.student.arfaz.assignment_10_class;

public class BaseRelationTable {

//	id, brandsId, categoryId, collectionId
	private int id,categoryId,collectionId;
	private String brandsId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(int collectionId) {
		this.collectionId = collectionId;
	}
	public String getBrandsId() {
		return brandsId;
	}
	public void setBrandsId(String brandsId) {
		this.brandsId = brandsId;
	}
	

}
