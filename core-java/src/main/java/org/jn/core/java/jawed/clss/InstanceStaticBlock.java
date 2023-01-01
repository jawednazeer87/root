package org.jn.core.java.jawed.clss;

public class InstanceStaticBlock {
	
	{
		System.out.println("normal block");
	}
	
	{
		System.out.println("normal block 2");
	}
	
	static {
		System.out.println("static block");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	public static void staticMethod() {
		System.out.println("this is static method");
	}

}
