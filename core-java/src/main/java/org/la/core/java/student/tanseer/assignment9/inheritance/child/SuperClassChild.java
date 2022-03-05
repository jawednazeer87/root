package org.la.core.java.student.tanseer.assignment9.inheritance.child;

import org.la.core.java.student.tanseer.assignment9.inheritance.parent.SuperClass;

public class SuperClassChild extends SuperClass
{
	
	@Override
	protected void print() {
		System.out.println("First printing parent protected print method from class : super keyword is used");
		super.print();
		System.out.println();
	}
	
	@Override
	public void display() {
		System.out.println("Overriden print method of class");
	}
	
}
