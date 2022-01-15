/**
 * 
 */
package org.la.core.java.jawed.operators.bit.wise;

/**
 * @author jawednazeer
 *
 */
public class RightShift {

	public static void main(String[] args) {
		
		byte x = 10;
		int shift = 5;
		int res = x >> shift;
		System.out.println("right shift "+shift+" times : "+res);
	}
}
