package org.jn.core.java.jawed.loop;

public class PrintNumCol2 {

	public static void main(String[] args) {

		int n = 5;
		
		for(int a=1; a<=n ;a++) {
			for(int x=1 ; x<=a ; x++) {
				System.out.print(a+" ");
			}
			System.out.println("");
		}
	}

}