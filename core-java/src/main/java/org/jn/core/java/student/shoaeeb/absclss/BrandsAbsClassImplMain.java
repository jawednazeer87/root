package org.jn.core.java.student.shoaeeb.absclss;

public class BrandsAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrandsAbsClass abs = new BrandsAbsClassImpl();
		abs.setId(1);
		abs.setBrandName("Nike");
		abs.setThumbnails("thumbnails");
		
		System.out.println("Id: "+abs.getId()+" BrandName: "+abs.getBrandName()+ " Thumbnails: " +abs.getThumbnails());
	}

}
