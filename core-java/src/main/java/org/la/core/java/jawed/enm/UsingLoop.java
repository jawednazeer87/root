package org.la.core.java.jawed.enm;

public class UsingLoop {
	enum Level {
		LOW, MEDIUM, HIGH
	}
	public static void main(String[] args) {
		for (Level myVar : Level.values()) {
			System.out.println(myVar);
		}
	}
}
