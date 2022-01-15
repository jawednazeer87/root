/**
 * 
 */
package org.la.core.java.jawed.operators.bit.wise;

/**
 * @author jawednazeer
 *
 */
public class AndExample {

	public static void main(String[] args) {
		
		byte x = 10;
		byte y = 1;
		int res = x & y;
		System.out.println("And: "+res);
		
		res = x | y;
		System.out.println("Or: "+res);
	}
}
