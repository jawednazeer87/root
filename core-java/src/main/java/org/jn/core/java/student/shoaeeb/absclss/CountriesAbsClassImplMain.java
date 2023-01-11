package org.jn.core.java.student.shoaeeb.absclss;

public class CountriesAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountriesAbsClass abs = new CountriesAbsClassImpl();
		abs.setCode(1);
		abs.setContinentName("xyz");
		abs.setName("sdaaf");
		
		System.out.println("Code: "+abs.getCode()+" name: "+abs.getContinentName()+" Name: "+abs.getName());
		
	}

}
