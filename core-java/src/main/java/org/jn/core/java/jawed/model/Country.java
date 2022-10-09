package org.jn.core.java.jawed.model;

public class Country {

	private String phoneCode;
	private String name;
	private String contient;
	private State state;
	/**
	 * @return the phoneCode
	 */
	public String getPhoneCode() {
		return phoneCode;
	}
	/**
	 * @param phoneCode the phoneCode to set
	 */
	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
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
	/**
	 * @return the contient
	 */
	public String getContient() {
		return contient;
	}
	/**
	 * @param contient the contient to set
	 */
	public void setContient(String contient) {
		this.contient = contient;
	}
	/**
	 * @return the city
	 */
	public State getState() {
		return state;
	}
	/**
	 * @param city the city to set
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	public void print() {
		System.out.println("Country: ");
		System.out.println("phoneCode: "+phoneCode);
		System.out.println("name: "+name);
		System.out.println("contient: "+contient);
		state.print();
	}
	
}