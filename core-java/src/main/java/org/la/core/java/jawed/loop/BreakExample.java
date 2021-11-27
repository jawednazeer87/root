package org.la.core.java.jawed.loop;

public class BreakExample {

	public static void main(String[] args) {
		
		int n = 40;
		
		while(n>=1) {
			
			if(n==25) {
				break;
			}
			System.out.println("n: "+n);
			n--;
		}
		
		System.out.println("Outside of the loop n: "+n);
	}
}