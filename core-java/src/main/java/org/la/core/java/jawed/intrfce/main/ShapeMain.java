/**
 * 
 */
package org.la.core.java.jawed.intrfce.main;

import org.la.core.java.jawed.intrfce.DrawnClass;
import org.la.core.java.jawed.intrfce.Shape;

/**
 * @author jawednazeer
 *
 */
public class ShapeMain {
	public static void main(String[] args) {
		Shape shape = FactoryPattern.factory("rectangle");
		DrawnClass.drawing(shape);
	}
}
