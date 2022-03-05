/**
 * 
 */
package org.la.core.java.jawed.lambda;

import org.la.core.java.jawed.intrfce.CheckClass;

/**
 * @author jawednazeer
 *
 */
public interface CheckMain {
	public static void main(String[] args) {
		Check.print();
		Check check = new CheckClass();
		int r = check.prod(10, 5);
		System.out.println("r: "+r);
		r = check.sum(1, 8);
		System.out.println("r: "+r);
		double d = check.div(12, 8);
		System.out.println("d: "+d);
	}
}
