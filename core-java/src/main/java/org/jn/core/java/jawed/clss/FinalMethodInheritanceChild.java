package org.jn.core.java.jawed.clss;

public class FinalMethodInheritanceChild extends FinalMethodInheritance {
	
	// cannot override a final method from child class
//	public void finalMethod() {
//		System.out.println("final method of parent");
//	}
	
	@Override
	public void method() {
		System.out.println("child method");
	}

}
