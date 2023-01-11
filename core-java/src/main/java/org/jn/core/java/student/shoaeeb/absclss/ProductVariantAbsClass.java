package org.jn.core.java.student.shoaeeb.absclss;

public abstract class ProductVariantAbsClass {
	int variantId;
	int productId;
	int finishId;
	int colorsId;
	String metaData;
	String thumbnails;
	
	//setters
	public abstract void setVariantId(int variantId);
	public abstract void setProductId(int productId);
	public abstract void setFinishId(int finishId);
	public abstract void setColorsId(int colorsId);
	public abstract void setMetaData(String metaData);
	public abstract void setThumbnails(String thumbnails);
	
	//getters
	public abstract int getVariantId();
	public abstract int getProductId();
	public abstract int getFinishId();
	public abstract int getColorsId();
	public abstract String getMetaData();
	public abstract String getThumbnails();
}
