package org.la.core.java.jawed.loop;

/*
 * Wap to print all Prime numbers between 1 to n.
 */
public class PrimeRange {

	public static void main(String[] args) {
		
		for(int n=3 ; n<=30 ; n++) {
			int i;
			for(i=2 ; i<n ; i++) {
				if(n%i==0) {
					break;
				}
			}
			if(n==i) {
				System.out.println("Prime number: "+n);
			}
		}
	}
}
