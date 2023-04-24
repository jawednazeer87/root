package org.jn.corejava.student.aameen.method;

public class InstanceStaticBlock {
	{
		System.out.println("This is a normal Block ");
	}
	
	static {
		System.out.println("Static block ");
	}
	
	public static void StaticMethod()
	{
		System.out.println("This is Static Method-1");
	}
	
}
