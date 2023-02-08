package org.jn.core.java.student.shoaeeb.polymorphism;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commercial c = new Commercial();
		c.setName("Shoaeeb");
		c.calculate(100);
		Domestic d = new Domestic();
		d.setName("Suraiya");
		d.calculate(100);
		
	}

}
