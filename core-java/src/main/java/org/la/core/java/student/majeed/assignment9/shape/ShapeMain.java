package org.la.core.java.student.majeed.assignment9.shape;

/*
 * 	01.	create a parent class Shape having void draw() method create 3 child/subclass which will extends Shape 
		class and will override draw method.
 */

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape = new Shape();
		Shape shape1 = new Rectangle();
		Shape shape2 = new Oval();
		Shape shape3 = new Diamond();
		shape.draw();
		shape1.draw();	
		shape2.draw();
		shape3.draw();
	}
}
