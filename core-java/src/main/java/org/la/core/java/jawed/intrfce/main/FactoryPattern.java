/**
 * 
 */
package org.la.core.java.jawed.intrfce.main;

import org.la.core.java.jawed.intrfce.Circle;
import org.la.core.java.jawed.intrfce.Rectangle;
import org.la.core.java.jawed.intrfce.Shape;
import org.la.core.java.jawed.intrfce.Square;
import org.la.core.java.jawed.intrfce.Triangle;

/**
 * @author jawednazeer
 *
 */
public class FactoryPattern {

	public static Shape factory(String name) {
		Shape shape = null;
		switch(name) {
			case "triangle":
				shape = new Triangle();
				break;
			case "circle":
				shape = new Circle();
				break;
			case "square":
				shape = new Square();
				break;
			case "rectangle":
				shape = new Rectangle();
				break;
		}
		return shape;
	}
}
