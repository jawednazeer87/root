package org.la.core.java.jawed.loop;

public class DecreaseStar {

	public static void main(String[] args) {
		
		int n = 20;
		for(int j=1 ; j<=n ; j++) {
			for(int y=1; y<=n-j+1 ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}