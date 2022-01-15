package org.la.core.java.jawed.method;


public class MethodThree2 {

	public static void main(String[] jhj) {
		int[] s = getArray();
		for(int a : s) {
			System.out.println("a: "+a);
		}
	}
	
	static int[] getArray() {
		return new int[] {3, 1, 9, 0};
	}
}
