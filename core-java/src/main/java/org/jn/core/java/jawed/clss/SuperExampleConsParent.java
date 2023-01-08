package org.jn.core.java.jawed.clss;

public class SuperExampleConsParent extends SuperExampleConsGrandParent{

	protected String name = "Parent";
	
	public SuperExampleConsParent(double d) {
		super(1, "one");
		System.out.println("Type name: SuperExampleConsParent");
		System.out.println("name: " + name + ", d: " + d); 
	}
}
