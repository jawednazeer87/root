package org.la.core.java.student.arfaz.assignment_10_class;

public class ProductVariant {

//	variantId, productId, finishId, colorsId, metadata, thumbnails	
	private int variantId;
	private int productId;
	private int finishId;
	private int colorsId;
	private int metadata;
	private int thumbnails;
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
	public int getMetadata() {
		return metadata;
	}
	public void setMetadata(int metadata) {
		this.metadata = metadata;
	}
	public int getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(int thumbnails) {
		this.thumbnails = thumbnails;
	}

}
