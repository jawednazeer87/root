/**
 * 
 */
package org.la.core.java.jawed.operators.bit.wise;

/**
 * @author jawednazeer
 *
 */
public class LeftShift {

	public static void main(String[] args) {
		
		byte x = (byte)129;
		int shift = 7;
		byte res = (byte)(x << shift);
		//System.out.println("left shift "+shift+" times : "+res);
		System.out.println("left shift "+shift+" times : "+x);
	}
}
