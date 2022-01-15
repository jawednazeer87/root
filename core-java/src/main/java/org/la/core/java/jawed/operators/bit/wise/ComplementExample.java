/**
 * 
 */
package org.la.core.java.jawed.operators.bit.wise;

/**
 * @author jawednazeer
 *
 */
public class ComplementExample {

	public static void main(String[] args) {
		
		byte x = 100;
		x = (byte)~x;
		System.out.println("value : "+x);
	}
}
