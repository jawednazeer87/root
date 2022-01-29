package org.la.core.java.jawed.model;

/**
 * @author jawednazeer
 *
 */
public class Street {

	public int streetNum;
	public String name;
	
	public Street() {
		this(1);
		System.out.println("default constructor");
	}
	public Street(int streetNum, String name) {
		this.streetNum = streetNum;
		this.name = name;
		System.out.println("2 parameters constructor");
	}
	public Street(int streetNum) {
		this.streetNum = streetNum;
		System.out.println("1 int parameters constructor");
	}
	public Street(String name) {
		this.name = name;
		System.out.println("1 String parameters constructor");
	}
	/**
	 * @return the postalcode
	 */
	public int getStreetNum() {
		return streetNum;
	}
	/**
	 * @param postalcode the postalcode to set
	 */
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("streetNum: "+streetNum);
		System.out.println("name: "+name);
	}
	
	
}
