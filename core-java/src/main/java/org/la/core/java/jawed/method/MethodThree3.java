package org.la.core.java.jawed.method;


public class MethodThree3 {

	public static void main(String[] jhj) {
		int[] s = getArrayOne();
		printArray(s);
		s = getArrayTwo();
		printArray(s);
		s = getArrayThree();
		printArray(s);
	}
	
	static void printArray(int arr[]) {
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	static int[] getArrayOne() {
		return new int[] {3, 1, 9, 0, 99};
	}
	static int[] getArrayTwo() {
		return new int[] {3};
	}
	static int[] getArrayThree() {
		return new int[] {3, 1, 9, 0, -1, -6, -100, 11};
	}
}
