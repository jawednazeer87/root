package org.jn.core.java.student.shoaeeb.clss;

public class BaseRelationTable {

	private int id;
	private int brandsId;
	private int categoryId;
	private int collectionId;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setBrandsId(int brandsId)
	{
		this.brandsId=brandsId;
	}
	public void setCategoryId(int categoryId)
	{
		this.categoryId=categoryId;
	}
	public void setCollectionId(int collectionId)
	{
		this.collectionId=collectionId;
	}
	
	//getters
	public int getId() {
		return id;
	}
	public int getCollectionId() {
		return collectionId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public int getBrandsId() {
		return brandsId;
	}
}