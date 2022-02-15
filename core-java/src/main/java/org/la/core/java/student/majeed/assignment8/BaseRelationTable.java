package org.la.core.java.student.majeed.assignment8;


/*
19.	Create a class BaseRelationTable having member variables id, brandsId, categoryId, collectionId. 
create getters and setters for all member variables. Create object of BaseRelationTable class in other 
class inside main method and set all member values and print all member values using getters.
	 */

public class BaseRelationTable {
	
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
}
