package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import org.la.core.java.student.tanseer.assignment9.inheritance.child.ShapeChildOne;
import org.la.core.java.student.tanseer.assignment9.inheritance.child.ShapeChildThree;
import org.la.core.java.student.tanseer.assignment9.inheritance.child.ShapeChildTwo;

public class ShapeMain 
{
	public static void main(String[] args) 
	{
		Shape s1 = new ShapeChildOne();
		Shape s2 = new ShapeChildTwo();
		Shape s3 = new ShapeChildThree();
		
		s1.draw();
		s2.draw();
		s3.draw();
	}
}
