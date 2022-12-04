/**
 * 
 */
package org.jn.core.java.jawed.method;

/**
 * @author jawednazeer
 *
 */
public class CallByReferenceExample {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.print("main before calling method   ");
		print(arr);
		changeReference(arr);
		System.out.print("main after calling method   ");
		print(arr);
	}
	static void changeReference(int[] b) {
		System.out.print("changeReference before changing value  ");
		print(b);
		b[0] = -100;
		b[2] = 509; 
		System.out.print("changeValue after  changing value  ");
		print(b);
	}
	
	static void print(int[] a) {
		for(int i : a)
			System.out.print(i+" ");
		System.out.println("");
	}
}
