package org.jn.core.java.jawed.method;

public class PrimeCalculate {

	public static void main(String[] args) {
		
		int i = 5;
		prime(i);
		
		int j = 7;
		prime(j);
		
		int k = 45;
		prime(k);
	}
	
	static void prime(int n) {
		int i;
		for(i=2 ; i<n ; i++) {
			if(n%i==0) {
				break;
			}
		}
		if(n==i) {
			System.out.println("Prime number: "+n);
		}
		else {
			System.out.println("Not a prime number: "+n);
		}
	}
}
