package org.jn.core.java.jawed.intrfc;

public class FirstInterfaceMain {

	public static void main(String[] args) {
		FirstInterface fi = new FirstInterfaceImpl();
		System.out.println("sum: " + fi.sum(10, 33));
		fi.print();
		FirstInterface.display();
	}
}
