package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import org.la.core.java.student.tanseer.assignment9.inheritance.child.IncreasingStarChild;

public class IncreasingStarMain 
{
	public static void main(String[] args) 
	{
		IncreasingStar in = new IncreasingStarChild();
		in.increaseStar(5);
	}
}
