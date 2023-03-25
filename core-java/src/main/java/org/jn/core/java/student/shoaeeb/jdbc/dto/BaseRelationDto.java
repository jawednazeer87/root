package org.jn.core.java.student.shoaeeb.jdbc.dto;

public class BaseRelationDto {
	private int id;
	private int brandsId;
	private int categoryId;
	private int collectionId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBrandsId() {
		return brandsId;
	}
	public void setBrandsId(int brandsId) {
		this.brandsId = brandsId;
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
	@Override
	public String toString() {
		return "BaseRelation [id=" + id + ", brandsId=" + brandsId + ", categoryId=" + categoryId + ", collectionId="
				+ collectionId + "]";
	}
}
