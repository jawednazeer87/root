package org.jn.core.java.student.shoaeeb.practice;

public class SuperExampleChild extends SuperExampleParent {
	String name = "Child";
	@Override
	public void method() {
		super.method();
		System.out.println("Child Method");
		System.out.println("name "+name);
	}
}
