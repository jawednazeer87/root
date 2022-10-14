package org.jn.core.java.jawed.loop;

public class Pyarmid {

	public static void main(String[] args) {
		
		int n = 6;
		for(int j=1 ; j<=n ; j++) {
			
			//printing space
			for(int spc=1 ; spc<=n-j ; spc++) {
				System.out.print(" ");
			}
			//printing start
			for(int y=1; y<=j ; y++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}