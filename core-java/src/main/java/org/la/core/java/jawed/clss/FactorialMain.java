/**
 * 
 */
package org.la.core.java.jawed.clss;

/**
 * @author jawednazeer
 *
 */
public class FactorialMain {

	public static void main(String[] args) {
		
		Factorial factorial = new Factorial();
		factorial.setNum(5);
		int res = factorial.factorial();
		System.out.println("res: "+res);
	}
}
