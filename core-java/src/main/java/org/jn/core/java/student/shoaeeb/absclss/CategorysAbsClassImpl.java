package org.jn.core.java.student.shoaeeb.absclss;

public class CategorysAbsClassImpl extends CategorysAbsClass{

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public void setCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		this.categoryName=categoryName;
	}

	@Override
	public void setThumbnails(String thumbnails) {
		// TODO Auto-generated method stub
		this.thumbnails=thumbnails;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String getCategoryName() {
		// TODO Auto-generated method stub
		return this.categoryName;
	}

	@Override
	public String getThumbnails() {
		// TODO Auto-generated method stub
		return this.thumbnails;
	}

}
