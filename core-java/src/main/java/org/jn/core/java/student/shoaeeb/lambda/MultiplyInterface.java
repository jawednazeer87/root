package org.jn.core.java.student.shoaeeb.lambda;

public interface MultiplyInterface {
	int mul(int a,int b);
	default void display() {
		System.out.println("Display method in interface");
	}
}
