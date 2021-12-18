package org.la.core.java.jawed.array;

public class Greatest {

	public static void main(String[] args) {
		
		int x[] = {1,-1, 50, 3, 1000};
		int g = x[0];
		for(int i=1 ; i<x.length ; i++) {
			if(g<x[i]) {
				g = x[i];
			}
		}
		System.out.println("Greatest: "+g);
	}
}
