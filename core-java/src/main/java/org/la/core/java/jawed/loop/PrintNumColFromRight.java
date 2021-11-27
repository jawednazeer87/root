package org.la.core.java.jawed.loop;

public class PrintNumColFromRight {

	public static void main(String[] args) {

		int n = 7;
		
		for(int a=1; a<=n ;a++) {
			
			for(int spc=1 ; spc<=n-a ; spc++) {
				System.out.print(" ");
			}
			for(int x=1 ; x<=a ; x++) {
				System.out.print(x);
			}
			System.out.println("");
		}
	}

}