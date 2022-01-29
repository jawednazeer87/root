package org.la.core.java.jawed.model;

/**
 * @author jawednazeer
 *
 */
public class Company {

	private int regNum;
	private String name;
	private String address;
	
	public Company() {
		regNum = 1;
		name = "";
		address = "";
		System.out.println("constructor called");
	}
	public Company(int regNum, String name, String address) {
		this.regNum = regNum;
		this.name = name;
		this.address = address;
		System.out.println("constructor called");
	}
	/**
	 * @return the regNum
	 */
	public int getRegNum() {
		return regNum;
	}
	/**
	 * @param regNum the regNum to set
	 */
	public void setRegNum(int regNum) {
		this.regNum = regNum;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("regNum: "+regNum);
		System.out.println("name: "+name);
		System.out.println("address: "+address);
	}
}
