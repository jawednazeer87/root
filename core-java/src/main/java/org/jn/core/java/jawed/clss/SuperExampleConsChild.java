package org.jn.core.java.jawed.clss;

public class SuperExampleConsChild extends SuperExampleConsParent{

	protected String name = "Child";
	
	public SuperExampleConsChild() {
		super(5.33);
		System.out.println("Type name: SuperExampleConsChild");
		System.out.println("name: " + name); 
	}
}
