package org.jn.core.java.jawed.loop;

public class SumOfDigitNum {

	public static void main(String[] args) {
		
		int n = 41423;
		int s = 0;
		
		for(; n>0 ; n=n/10) {
			int r = n % 10;
			s = s + r;
		}
		
		System.out.println("Sum: "+s);
	}

}