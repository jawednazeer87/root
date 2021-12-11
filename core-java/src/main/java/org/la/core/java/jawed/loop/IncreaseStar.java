package org.la.core.java.jawed.loop;

public class IncreaseStar {

	public static void main(String[] args) {
		
		for(int j=1 ; j<=3 ; j++) {
			for(int y=1; y<=j ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}