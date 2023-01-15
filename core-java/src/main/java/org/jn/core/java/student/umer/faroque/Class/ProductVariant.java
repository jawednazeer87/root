package org.jn.core.java.student.umer.faroque.Class;

public class ProductVariant {
	
	private int variantId;
	private int productId;
	private int finishId;
	private int colorsId;
	private String metaData;
	private String thumbnails;
	
	//setters
	public void setVariantId(int variantId)
	{
		this.variantId=variantId;
	}
	public void setProductId(int productId)
	{
		this.productId=productId;
	}
	public void setFinishId(int finishId)
	{
		this.finishId=finishId;
	}
	public void setColorsId(int colorsId)
	{
		this.colorsId=colorsId;
	}
	public void setMetaData(String metaData)
	{
		this.metaData=metaData;
	}
	public void setThumbnails(String thumbnails)
	{
		this.thumbnails=thumbnails;
	}
	
	//getters
	public int getVariantId() {
		return variantId;
	}
	public int getProductId() {
		return productId;
	}
	public int getFinishId() {
		return finishId;
	}
	public int getColorsId() {
		return colorsId;
	}
	public String getMetaData() {
		return metaData;
	}
	public String getThumbnails() {
		return thumbnails;
	}
}
