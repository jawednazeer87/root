package org.la.core.java.student.arfaz.assignment_10_class;

public class BrandsMain {

	public static void main(String[] args) {
		Brands comp = new Brands();
//		id, brandName, thumbnails
		comp.setId(0);
		comp.setBrandName("Arfaz");
		comp.setThumbnails("Image");
		System.out.println(comp.getId());
		System.out.println(comp.getBrandName());
		System.out.println(comp.getThumbnails());
	}

}
