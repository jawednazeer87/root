package org.jn.adv.student.moshin.jdbc.dto;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class BaseRelationTableDTO {
	private String id;
	private String brandsName;
	private String categoryId;
	private String collectionId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrandsName() {
		return brandsName;
	}
	public void setBrandsName(String brandsName) {
		this.brandsName = brandsName;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}
	@Override
	public String toString() {
		return "BaseRelationTable [id=" + id + ", brandsName=" + brandsName + ", categoryId=" + categoryId
				+ ", collectionId=" + collectionId + "]";
	}

}
