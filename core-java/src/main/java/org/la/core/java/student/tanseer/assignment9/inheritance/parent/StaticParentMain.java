package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import org.la.core.java.student.tanseer.assignment9.inheritance.child.StaticChild;

public class StaticParentMain 
{
	public static void main(String[] args) 
	{
		StaticParent.fun();
		StaticChild sc = new StaticChild();
		sc.fun();
	}
}
