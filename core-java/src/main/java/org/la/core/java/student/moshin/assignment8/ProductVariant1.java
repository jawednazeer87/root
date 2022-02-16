package org.la.core.java.student.moshin.assignment8;

public class ProductVariant1 {
	
	private int variantId, productId, finishId, colorsId;
    private boolean metadata, thumbnails;

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

    public boolean isMetadata() {
        return metadata;
    }

    public void setMetadata(boolean metadata) {
        this.metadata = metadata;
    }

    public boolean isThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(boolean thumbnails) {
        this.thumbnails = thumbnails;
    }
}
