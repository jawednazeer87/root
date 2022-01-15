/**
 * 
 */
package org.la.core.java.jawed.method;

/**
 * @author jawednazeer
 *
 */
public class ChangingValue {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.print("main before calling method   ");
		print(arr);
		changeValue(arr[1]);
		System.out.print("main after calling method   ");
		print(arr);
	}
	static void changeValue(int b) {
		System.out.println("changeValue before changing value  "+b);
		b = -100;
		System.out.println("changeValue after  changing value  "+b);
	}
	static void print(int[] a) {
		for(int i : a)
			System.out.print(i+" ");
		System.out.println("");
	}
}
