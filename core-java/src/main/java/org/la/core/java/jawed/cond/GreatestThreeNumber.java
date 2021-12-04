package org.la.core.java.jawed.cond;

public class GreatestThreeNumber {

	public static void main(String[] args) {
		
		int a=12, b=38, c=50;
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
	}
}
