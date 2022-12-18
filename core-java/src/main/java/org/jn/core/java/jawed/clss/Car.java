package org.jn.core.java.jawed.clss;

import java.util.Date;

public class Car {
	
	int number;
	String brand;
	Date expiry;
	
	public void setter(int num, String br, Date ex) {
		number = num;
		brand = br;
		expiry = ex;
	}
	
	public void print() {
		System.out.println("number: "+number);
		System.out.println("brand: "+brand);
		System.out.println("expiry: "+expiry);
	}
}
