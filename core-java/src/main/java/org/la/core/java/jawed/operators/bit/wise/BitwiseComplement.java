/**
 * 
 */
package org.la.core.java.jawed.operators.bit.wise;

/**
 * @author jawednazeer
 * Bitwise complement represented by ~
 * It is important to note that the bitwise complement of any integer N is equal to - (N + 1)
 * Consider an integer 35. As per the rule, the bitwise complement of 35 should be -(35 + 1) = -36
 */
public class BitwiseComplement {

	public static void main(String[] args) {

		int number = 35, result;

		// bitwise complement of 35
		result = ~number;
		System.out.println(result); // prints -36
	}
}
