/**
 * 
 */
package org.jn.core.java.jawed.method;

/**
 * @author jawednazeer
 *
 */
public class FactorialRecursion {

	public static void main(String[] args) {
		int x = 3;
		int result = factorial(x);
		System.out.println("factorial: "+result);
	}
	static int factorial(int f) {
		if(f==1) {
			return 1;
		}
		return f * factorial(f-1);
	}
}
