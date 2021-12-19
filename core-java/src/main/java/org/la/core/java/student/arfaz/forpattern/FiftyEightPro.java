package org.la.core.java.student.arfaz.forpattern;

public class FiftyEightPro {

	public static void main(String[] args) {
		int n=1756256478,first=0,last=0;
		first=n;
		for(;first>=10;) {
		first=first/10;
    	
	}
		last=n%10;
		System.out.println("Sum of 1st, last "+(first+last));
	}
//	find first and last digit of a number.
}
