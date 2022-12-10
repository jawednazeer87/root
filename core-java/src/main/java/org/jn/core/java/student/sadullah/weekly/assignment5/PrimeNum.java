package org.jn.core.java.student.sadullah.weekly.assignment5;

import java.util.Iterator;

public class PrimeNum {
	static boolean prime(int a) {
		boolean prime;
		int def = 0;
		for (int i = 1; i < a; i++) {
			if (a%i==0) {
				def++;
			}
		}
		if (def==1) {
			prime = true;
		}
		else {
			prime = false;
		}
		return prime;
	}
	
	
	public static void main(String[] argrs) {
		boolean primeOrNot = prime(11);
		
		System.out.println(primeOrNot);
	}
}
