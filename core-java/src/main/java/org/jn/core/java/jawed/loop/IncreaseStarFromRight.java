package org.jn.core.java.jawed.loop;

public class IncreaseStarFromRight {

	public static void main(String[] args) {
		
		int n = 7;
		for(int j=1 ; j<=n ; j++) {
			
			//printing space
			for(int spc=1 ; spc<=n-j ; spc++) {
				System.out.print(" ");
			}
			//printing start
			for(int str=1; str<=j ;str++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}