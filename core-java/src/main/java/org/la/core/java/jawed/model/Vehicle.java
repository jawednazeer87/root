/**
 * 
 */
package org.la.core.java.jawed.model;

/**
 * @author jawednazeer
 *
 */
public class Vehicle {

	int numWheels;
	String engine;
	/**
	 * @return the numWheels
	 */
	public int getNumWheels() {
		return numWheels;
	}
	/**
	 * @param numWheels the numWheels to set
	 */
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public void print() {
		System.out.println("this is vehicle class print method");
	}
	
	void display() {
		System.out.println("this is vehicle class display method");
	}
	
}
