package org.jn.core.java.student.shoaeeb.clss;

public class CountriesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countries c = new Countries();
		c.setCode(5611);
		c.setContinentName("Australia");
		c.setName("Australia");
		
		System.out.println("Code: "+c.getCode()+" Name: "+c.getName()+ " Continent Name: "+c.getContinentName());
	}

}
