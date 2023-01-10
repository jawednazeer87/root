package org.jn.core.java.jawed.clss;

public class SuperExampleParent extends SuperExampleGrandParent{

	protected String name = "Parent";
	
	@Override
	protected void typeName() {
		System.out.println("Type name: SuperExampleParent");
		System.out.println("name: " + name); 
		super.typeName();
	}
}
