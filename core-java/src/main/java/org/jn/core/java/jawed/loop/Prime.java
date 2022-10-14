package org.jn.core.java.jawed.loop;

public class Prime {

	public static void main(String[] args) {
		
		int n = 61;
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