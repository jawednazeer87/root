package org.jn.core.java.jawed.intrfc;

@FunctionalInterface
public interface FirstInterface {

	int sum(int i, int j);
	
	static void display() {
		System.out.println("static display method");
	}
	
	default void print() {
		System.out.println("default print method");
	}
}
