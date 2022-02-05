/**
 * 
 */
package org.la.core.java.jawed.model;

/**
 * @author jawednazeer
 *
 */
public class Car extends Vehicle{	//is-a
	int numDoors;
	public void set() {
		numWheels = 2;
		engine = "big engine";
		numDoors = 4; 
	}
	
	public void message() {
		print();
		System.out.println("car message method");
	}
}
