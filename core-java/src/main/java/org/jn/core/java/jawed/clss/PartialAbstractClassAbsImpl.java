package org.jn.core.java.jawed.clss;

public abstract class PartialAbstractClassAbsImpl extends PartialAbstractClass{

	public PartialAbstractClassAbsImpl() {
		System.out.println("PartialAbstractClassAbsImpl default constructor");
	}
	
	@Override
	public void method() {
		System.out.println("this is abstract method of parent class");
	}
}
