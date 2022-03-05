package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import org.la.core.java.student.tanseer.assignment9.inheritance.child.CopyArrayChild;

public class CopyArrayMain 
{
	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30, 40, 50};
		CopyArray cp = new CopyArrayChild();
		cp.copy(a);
	}
}
