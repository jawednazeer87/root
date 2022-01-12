package org.la.core.java.jawed.enm;

public class UsingVariable {
	enum Level {
		LOW, MEDIUM, HIGH
	}
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
	}
}