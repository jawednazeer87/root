package org.jn.core.java.student.shoaeeb.practice;

public class SuperExampleParent extends SuperExampleGrandParent {
	public String name = "Parent";
	
	@Override
	public void method() {
		super.method();
		System.out.println("Parent Method");
		System.out.println("name "+name);
	}
}
