package org.jn.core.java.student.sayed.hassain.clss;

public class CityMain {
	
	public static void main(String[] args) {
		
		City city=new City();
		
		city.setterId(10101);
		System.out.println(city.getterId());
		
		city.setterCity("Kolkata");
		System.out.println(city.getterCity());
	}

}
