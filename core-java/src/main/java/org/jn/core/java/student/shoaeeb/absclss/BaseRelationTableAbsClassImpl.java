package org.jn.core.java.student.shoaeeb.absclss;

public class BaseRelationTableAbsClassImpl extends BaseRelationTableAbsClass{

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public void setBrandsId(int brandsId) {
		// TODO Auto-generated method stub
		this.brandsId=brandsId;
	}

	@Override
	public void setCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		this.categoryId=categoryId;
	}

	@Override
	public void setCollectionId(int collectionId) {
		// TODO Auto-generated method stub
		this.collectionId=collectionId;
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public int getBrandsId() {
		// TODO Auto-generated method stub
		return this.brandsId;
	}

	@Override
	public int getCategoryId() {
		// TODO Auto-generated method stub
		return this.categoryId;
	}

	@Override
	public int getCollectionId() {
		// TODO Auto-generated method stub
		return this.collectionId;
	}

}
