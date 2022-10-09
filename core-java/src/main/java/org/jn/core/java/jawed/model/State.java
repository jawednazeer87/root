package org.jn.core.java.jawed.model;

public class State {

	private int postalcode;
	private String name;
	private City city;
	
	public State(int postalcode ,String name, City city) {
		this.postalcode = postalcode;
		this.name = name;
		this.city = city;
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
	
	public City getCity() {
		return city;
	}
	
	public void setName(City city) {
		this.city = city;
	}
	public void print() {
		System.out.println("State: ");
		System.out.println("postalcode: "+postalcode);
		System.out.println("name: "+name);
		city.print();
	}
}