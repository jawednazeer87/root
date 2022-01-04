package org.la.core.java.student.sajid.array;

public class Q26 {

	public static void main(String[] args) {
		int[] arr = { 2000, 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };
		int gvn = 2456;
		for (int i = 0; i < arr.length; i++) {
			if (gvn == arr[i]) {
				System.out.println("yes: specific value");
				break;
			} 
		}
	}

}
