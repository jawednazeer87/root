/**
 * 
 */
package org.jn.core.java.jawed.method;

/**
 * @author jawednazeer
 *
 */
public class CallByReferenceExample2 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.print("main before calling method   ");
		print(arr);
		changeValue(arr);
		System.out.print("main after calling method   ");
		print(arr);
	}
	static void changeValue(int[] b) {
		System.out.print("changeValue before changing value  ");
		print(b);
		b = new int[]{0, -1, 6};
		System.out.print("changeValue after  changing value  ");
		print(b);
	}
	
	static void print(int[] a) {
		for(int i : a)
			System.out.print(i+" ");
		System.out.println("");
	}
}
