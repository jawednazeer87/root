package org.jn.core.java.student.shoaeeb.clss;

public class CategoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categorys cr = new Categorys();
		cr.setId(1);
		cr.setCategoryName("Hoodie");
		cr.setThumnails("thumbnails");
		
		System.out.println("Id: "+cr.getId()+" Category Name: "+cr.getCategoryName()+" Thumbnails: "+cr.getThumbnails());
	}

}
