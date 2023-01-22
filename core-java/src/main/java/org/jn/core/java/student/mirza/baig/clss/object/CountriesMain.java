package org.jn.core.java.student.mirza.baig.clss.object;

public class CountriesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Countries c= new Countries();
		c.setCode(91);
		c.setName("india");
		c.setContinentName("asia");
		
		System.out.println("Country code  :"+c.getCode());
		System.out.println("Country name  :"+c.getName());
		System.out.println("Countinent    :"+c.getCountinentName());

	}

}
