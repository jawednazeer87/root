package org.jn.core.java.student.shoaeeb.absclss;

public class CityAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CityAbsClass abs = new CityAbsClassImpl();
		abs.setId(1);
		abs.setCity("New York");
		
		System.out.println("Id: "+abs.getId()+" City: "+abs.getCity());
	}

}
