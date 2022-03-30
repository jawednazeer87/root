package org.jn.adv.student.moshin.jdbc.dto;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class CollectionsDTO {
	
	private String id;
	private String collectionName;
	private String thumbNails;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCollectionName() {
		return collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
	public String getThumbNails() {
		return thumbNails;
	}
	public void setThumbNails(String thumbNails) {
		this.thumbNails = thumbNails;
	}
	@Override
	public String toString() {
		return "Collections [id=" + id + ", collectionName=" + collectionName + ", thumbNails=" + thumbNails + "]";
	}
	
	
	

}
