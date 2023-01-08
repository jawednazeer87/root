package org.jn.core.java.jawed.clss;

public class SuperExampleChild extends SuperExampleParent{

	protected String name = "Child";
	
	@Override
	public void typeName() {
		System.out.println("Type name: SuperExampleChild");
		System.out.println("name: " + name); 
		System.out.println("parent name: " + super.name); 
		super.typeName();
	}
}
