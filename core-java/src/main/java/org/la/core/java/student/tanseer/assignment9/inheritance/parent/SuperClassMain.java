package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import org.la.core.java.student.tanseer.assignment9.inheritance.child.SuperClassChild;

public class SuperClassMain 
{
	public static void main(String[] args) 
	{
		SuperClass su = new SuperClassChild();
		su.print();
		su.display();
		
	}
}
