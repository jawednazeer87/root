package org.jn.adv.waleed.jdbc.model;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class ProductVariant {
	private String variantId;
	private String productId;
	private String finishId;
	private String colorId;
	private String metadata;
	private String thumbnails;
	public String getVariantId() {
		return variantId;
	}
	public void setVariantId(String variantId) {
		this.variantId = variantId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getFinishId() {
		return finishId;
	}
	public void setFinishId(String finishId) {
		this.finishId = finishId;
	}
	public String getColorId() {
		return colorId;
	}
	public void setColorId(String colorId) {
		this.colorId = colorId;
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
	@Override
	public String toString() {
		return "ProductVariant [variantId=" + variantId + ", productId=" + productId + ", finishId=" + finishId
				+ ", colorId=" + colorId + ", metadata=" + metadata + ", thumbnails=" + thumbnails + "]";
	}
	
}
