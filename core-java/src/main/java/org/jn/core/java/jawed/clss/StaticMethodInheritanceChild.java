package org.jn.core.java.jawed.clss;

public class StaticMethodInheritanceChild extends StaticMethodInheritance {
	
	public static void staticMethod() {
		System.out.println("This is static method child");
	}
	
	@Override
	public void instanceMethod() {
		System.out.println("This is intance method child");
	}

}
