package org.jn.adv.student.moshin.jdbc.model;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class DimensionHasProductVariant {
	private String dimensionId;
	private String productId;
	private String variantId;
	public String getDimensionId() {
		return dimensionId;
	}
	public void setDimensionId(String dimensionId) {
		this.dimensionId = dimensionId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getVariantId() {
		return variantId;
	}
	public void setVariantId(String variantId) {
		this.variantId = variantId;
	}
	@Override
	public String toString() {
		return "DimensionHasProductVariant [dimensionId=" + dimensionId + ", productId=" + productId + ", variantId="
				+ variantId + "]";
	}
	
	

}
