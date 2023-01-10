package org.jn.core.java.jawed.intrfc;

public class PrintMain {

	public static void main(String[] args) {
		PrintOne po = new PrintOneTwoImpl();
		po.print();
		PrintThree ptr = new PrintOneTwoImpl();
		ptr.display();
	}
}
