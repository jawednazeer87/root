package org.jn.core.java.student.shoaeeb.absclss;

public abstract class BaseRelationTableAbsClass {
	int id;
	int brandsId;
	int categoryId;
	int collectionId;
	
	//setters
	public abstract void setId(int id);
	public abstract void setBrandsId(int brandsId);
	public abstract void setCategoryId(int categoryId);
	public abstract void setCollectionId(int collectionId);
	
	//getters
	public abstract int getId();
	public abstract int getBrandsId();
	public abstract int getCategoryId();
	public abstract int getCollectionId();
	
	
}
