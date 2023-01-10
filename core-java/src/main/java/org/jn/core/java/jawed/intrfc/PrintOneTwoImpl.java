package org.jn.core.java.jawed.intrfc;

public class PrintOneTwoImpl implements PrintOne, PrintThree, PrintTwo {

	@Override
	public void print() {
		System.out.println("PrintOneTwoImpl"); 
	}

}
