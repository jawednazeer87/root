package org.la.core.java.student.arfaz.assignment_10_class;

public class CategorysMain {

	public static void main(String[] args) {
		Categorys comp = new Categorys();
//		id, categoryName, thumbnails
		comp.setId(0);
		comp.setCategoryName("Arfaz");
		comp.setThumbnails("Image");
		System.out.println(comp.getId());
		System.out.println(comp.getCategoryName());
		System.out.println(comp.getThumbnails());
	}

}
