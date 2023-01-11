package org.jn.core.java.student.shoaeeb.absclss;

public class ProductVariantAbsClassImpl extends ProductVariantAbsClass{

	@Override
	public void setVariantId(int variantId) {
		// TODO Auto-generated method stub
		this.variantId=variantId;
	}

	@Override
	public void setProductId(int productId) {
		// TODO Auto-generated method stub
		this.productId=productId;
	}

	@Override
	public void setFinishId(int finishId) {
		// TODO Auto-generated method stub
		this.finishId=finishId;
	}

	@Override
	public void setColorsId(int colorsId) {
		// TODO Auto-generated method stub
		this.colorsId=colorsId;
	}

	@Override
	public void setMetaData(String metaData) {
		// TODO Auto-generated method stub
		this.metaData=metaData;
	}

	@Override
	public void setThumbnails(String thumbnails) {
		// TODO Auto-generated method stub
		this.thumbnails=thumbnails;
	}

	@Override
	public int getVariantId() {
		// TODO Auto-generated method stub
		return this.variantId;
	}

	@Override
	public int getProductId() {
		// TODO Auto-generated method stub
		return this.productId;
	}

	@Override
	public int getFinishId() {
		// TODO Auto-generated method stub
		return this.finishId;
	}

	@Override
	public int getColorsId() {
		// TODO Auto-generated method stub
		return this.colorsId;
	}

	@Override
	public String getMetaData() {
		// TODO Auto-generated method stub
		return this.metaData;
	}

	@Override
	public String getThumbnails() {
		// TODO Auto-generated method stub
		return this.thumbnails;
	}

}
