package org.la.core.java.student.majeed.assignment8;

/*
24.	Create a class ProductVariant having member variables variantId, productId, finishId, colorsId, metadata, thumbnails. 
create getters and setters for all member variables. Create object of ProductVariant class in other class inside main 
method and set all member values and print all member values using getters.
*/

public class ProductVariant {
    private int variantId; 
    private int productId; 
    private int finishId; 
    private int colorsId;
    private String metadata; 
    private String thumbnails;
    
	public int getVariantId() {
		return variantId;
	}
	public void setVariantId(int variantId) {
		this.variantId = variantId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getFinishId() {
		return finishId;
	}
	public void setFinishId(int finishId) {
		this.finishId = finishId;
	}
	public int getColorsId() {
		return colorsId;
	}
	public void setColorsId(int colorsId) {
		this.colorsId = colorsId;
	}
	public String getMetadata() {
		return metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	public String getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}
}
