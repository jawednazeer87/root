package org.la.core.java.student.meenah.mainabstra;

import org.la.core.java.student.meenah.abstra.Circle;
import org.la.core.java.student.meenah.abstra.Rectangle;
import org.la.core.java.student.meenah.abstra.Shape;
import org.la.core.java.student.meenah.abstra.Square;

public class MainShape {

	public static void main(String[] args) {
		
		
		Shape shape = new Square();
		shape.drew();
		
		Shape shape1 = new Rectangle();
		shape1.drew();
		
		Shape shape2 = new Circle();
		shape2.drew();
		

	}

}
