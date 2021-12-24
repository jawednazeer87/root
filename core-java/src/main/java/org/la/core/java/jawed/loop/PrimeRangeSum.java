package org.la.core.java.jawed.loop;

/*
 * Wap to find sum of all prime numbers between 1 to n.
 */
public class PrimeRangeSum {

	public static void main(String[] args) {
		
		int s = 0;
		for(int n=3 ; n<=15 ; n++) {
			int i;
			for(i=2 ; i<n ; i++) {
				if(n%i==0) {
					break;
				}
			}
			if(n==i) {
				System.out.println("Prime number: "+n);
				s += n;
			}
		}
		System.out.println("Sum of prime numbers: "+s);
	}
}
