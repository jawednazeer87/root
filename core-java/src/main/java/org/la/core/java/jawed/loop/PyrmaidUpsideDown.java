package org.la.core.java.jawed.loop;

public class PyrmaidUpsideDown {

	public static void main(String[] args) {
		
		int n = 5;
		for(int j=1 ; j<=n ; j++) {
			//printing space
			for(int spc=1 ; spc<j ; spc++) {
				System.out.print(" ");
			}
			//printing start
			for(int y=1; y<=n-j+1 ; y++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}