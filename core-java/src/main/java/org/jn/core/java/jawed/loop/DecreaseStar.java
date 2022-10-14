package org.jn.core.java.jawed.loop;

public class DecreaseStar {

	public static void main(String[] args) {
		int n = 6;
		for(int j=1 ; j<=n ; j++) {
			for(int y=0; y<=n-j ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}