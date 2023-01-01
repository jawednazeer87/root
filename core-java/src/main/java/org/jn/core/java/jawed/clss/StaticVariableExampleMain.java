package org.jn.core.java.jawed.clss;

public class StaticVariableExampleMain {

	public static void main(String[] args) {
		StaticVariableExample sve1 = new StaticVariableExample();
		sve1.print();
		sve1.max = -1;
		sve1.instVar = 9;
		StaticVariableExample sve2 = new StaticVariableExample();
		sve2.print();
		sve2.max = 45;
		sve2.instVar = 12339;
		StaticVariableExample sve3 = new StaticVariableExample();
		sve3.print();
		sve3.max = -100;
		sve3.instVar = 343;
		StaticVariableExample sve4 = new StaticVariableExample();
		sve4.print();
	}
}
