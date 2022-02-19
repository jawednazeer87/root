package org.la.core.java.student.waleed.homework.classwr;

import org.la.core.java.student.waleed.homework.classwr.model.Circle;
import org.la.core.java.student.waleed.homework.classwr.model.Rectangle;
import org.la.core.java.student.waleed.homework.classwr.model.Shape;

/**
 * @author Waleed Rizq
 *
 * @date Feb 19, 2022
 */
public class ShapeMain {

	
	public static void main(String[] args) {
		
		Shape shape = new Rectangle();
		shape.draw();
	    shape = new Circle();
	    shape.draw();

	}

}
