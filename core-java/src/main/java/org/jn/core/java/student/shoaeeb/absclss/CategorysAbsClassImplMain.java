package org.jn.core.java.student.shoaeeb.absclss;

public class CategorysAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategorysAbsClass abs = new CategorysAbsClassImpl();
		abs.setId(1);
		abs.setCategoryName("category");
		abs.setThumbnails("thumbnails");
		
		System.out.println("Id: "+abs.getId()+" category: "+abs.getCategoryName()+" thumbnails: "+abs.getThumbnails());
	}

}
