package org.jn.core.java.jawed.loop;

public class DecreaseStarFromRight {

	public static void main(String[] args) {
		int n = 1;
		for(int j=1 ; j<=n ; j++) {
			//printing space
			for(int spc=1 ; spc<j ; spc++) {
				System.out.print(" ");
			}
			//printing start
			for(int y=0; y<=n-j ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}