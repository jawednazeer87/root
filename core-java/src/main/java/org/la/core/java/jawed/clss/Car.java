/**
 * 
 */
package org.la.core.java.jawed.clss;

import java.util.Date;

/**
 * @author jawednazeer
 *
 */
public class Car {
	int number;
	String brand;
	Date expiry;
	public void print() {
		System.out.println("number: "+number);
		System.out.println("brand: "+brand);
		System.out.println("expiry: "+expiry);
	}
	public void setter(int num, String br, Date ex) {
		number = num;
		brand = br;
		expiry = ex;
	}
}
