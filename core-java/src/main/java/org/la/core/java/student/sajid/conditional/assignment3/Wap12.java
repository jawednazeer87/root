package org.la.core.java.student.sajid.conditional.assignment3;

public class Wap12 {

	public static void main(String[] args) {
		int i = -90;
		int j = -99;
		int k = -111;
		
		System.out.println("first number: "+i);
		System.out.println("second number: "+j);
		
		if (i<j && i != j && i<k && i != k ) {
			System.out.println("i is smaller");
		}else if (j<k && j != k && j<i && j != i) {
			System.out.println("j is smaller");
		}else if (k<i && k != i && k<j && k !=j) {
			System.out.println("k is smaller");
			}
	}

}
