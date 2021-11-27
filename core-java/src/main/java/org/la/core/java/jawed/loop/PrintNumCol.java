package org.la.core.java.jawed.loop;

public class PrintNumCol {

	public static void main(String[] args) {

		int n = 2;
		
		for(int a=1; a<=n ;a++) {
			for(int x=1 ; x<=a ; x++) {
				System.out.print(x);
			}
			System.out.println("");
		}
	}

}