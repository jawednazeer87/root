/**
 * 
 */
package org.la.core.java.jawed.operators.bit.wise;

/**
 * @author jawednazeer
 * printing all bits of a number
 */
public class PrintAllBits {

	public static void main(String[] args) {
		
		byte num1=127;
		//printAllBitsByte(num1);			//print 8 bits representation
		//printAllBitsChar('A');				//print 16 bits representation
		printAllBitsInt(-1);				//print 32 bits representation
	}
	static void printAllBitsByte(Byte b) {
		for(int i=7 ; i>=0 ; i--) {
			System.out.print((b>>i&1)+" ");
		}
	}
	static void printAllBitsChar(int b) {
		for(int i=15 ; i>=0 ; i--) {
			System.out.print((b>>i&1)+" ");
		}
	}
	static void printAllBitsInt(int b) {
		for(int i=31 ; i>=0 ; i--) {
			System.out.print((b>>i&1)+" ");
		}
	}
}
