package org.la.core.java.student.arfaz.assignment_10_class;

public class ProductsVariantMain {

	public static void main(String[] args) {
		ProductVariant  pob =  new ProductVariant ();
//		variantId, productId, finishId, colorsId, metadata, thumbnails
		pob.setVariantId(12);
		pob.setProductId(1234);
		pob.setFinishId(3456789);
		pob.setColorsId(4567);
		pob.setMetadata(456789);
		pob.setThumbnails(123789);
		System.out.println(pob.getVariantId());
		System.out.println(pob.getProductId());
		System.out.println(pob.getColorsId());
		System.out.println(pob.getFinishId());
		System.out.println(pob.getMetadata());
		System.out.println(pob.getThumbnails());
	}

}
