package org.jn.core.java.student.shoaeeb.absclss;

public class StuffAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StuffAbsClass abs = new StuffAbsClassImpl();
		abs.setId(1);
		abs.setStuffName("stuff name");
		abs.setThumbnails("thumbnails");
		
		System.out.println("Id: "+abs.getId()+" StuffName: "+abs.getStuffName()+" thumbnails: "+abs.getThumbnails());
	}

}
