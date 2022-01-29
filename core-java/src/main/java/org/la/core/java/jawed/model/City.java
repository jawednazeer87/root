package org.la.core.java.jawed.model;

/**
 * @author jawednazeer
 *
 */
public class City {

	public int postalcode;
	public String name;
	
	public City(int postalcode, String name) {
		this.postalcode = postalcode;
		this.name = name;
	}
	/**
	 * @return the postalcode
	 */
	public int getPostalcode() {
		return postalcode;
	}
	/**
	 * @param postalcode the postalcode to set
	 */
	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
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
		System.out.println("City: ");
		System.out.println("postalcode: "+postalcode);
		System.out.println("name: "+name);
	}
	
	
}
