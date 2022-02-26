package org.la.core.java.student.tanseer.assignment9.inheritance.child;
/*
 * 01.	create a parent class Shape having void draw() method create 3 child/subclass
 *  which will extends Shape class and will override draw method.
 */

import org.la.core.java.student.tanseer.assignment9.inheritance.parent.Shape;

public class ShapeChildThree extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Child 3 of shape class");
	}
}
