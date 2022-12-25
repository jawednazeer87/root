package org.jn.core.java.jawed.method;


public class ReturnArrayVariable {

	public static void main(String[] jhj) {
		int[] s = getArray();
		for(int a : s) {
			System.out.println("a: "+a);
		}
	}
	
	static int[] getArray() {
		int[] array = {3, 1, 9, 0, -1, 1888};
		return array;
	}
}
