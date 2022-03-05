/**
 * 
 */
package org.la.core.java.jawed.lambda;

/**
 * @author jawednazeer
 *
 */

public interface Check {

	int sum(int a, int b);
	double div(int x, int y);
	default int prod(int x, int y) {
		return x * y;
	}
	static void print() {
		System.out.println("This is static method of an interface");
	}
}
