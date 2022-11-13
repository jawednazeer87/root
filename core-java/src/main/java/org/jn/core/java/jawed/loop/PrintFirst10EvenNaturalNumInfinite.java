package org.jn.core.java.jawed.loop;

public class PrintFirst10EvenNaturalNumInfinite {

	public static void main(String[] args) {
		
		int i=0, n = 1;
		
		while(true) {
			if(n%2==0) {
				System.out.print(n+" ");
				i++;
			}
			n++;
			if(i==10) {
				break;
			}
		}
		System.out.println("\nEnd");
	}
}