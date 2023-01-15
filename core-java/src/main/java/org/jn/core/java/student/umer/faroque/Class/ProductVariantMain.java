package org.jn.core.java.student.umer.faroque.Class;

public class ProductVariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductVariant pr = new ProductVariant();
		pr.setVariantId(1);
		pr.setThumbnails("thumbnails");
		pr.setProductId(5);
		pr.setMetaData("meta data");
		pr.setFinishId(6);
		pr.setColorsId(7);
		
		System.out.println("variant Id: "+pr.getVariantId()+"Thumbnails: "+pr.getThumbnails()+" Product Id: "+pr.getProductId()+" Meta Data: "+pr.getMetaData());
	}

}
