package org.jn.core.java.jawed.intrfc;

public class FirstInterfaceImpl implements FirstInterface {

	@Override
	public int sum(int i, int j) {
		return i + j;
	}
	
	@Override
	public void print() {
		System.out.println("default print method FirstInterfaceImpl");
	}
}
