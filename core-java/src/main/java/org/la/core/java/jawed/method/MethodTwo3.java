package org.la.core.java.jawed.method;

public class MethodTwo3 {

	public static void main(String[] args) {
		int i = 5;
		decreaseStarPattern(i);
	}
	
	static void decreaseStarPattern(int n) {
		for(int j=1 ; j<=n ; j++) {
			for(int y=0; y<=n-j ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
