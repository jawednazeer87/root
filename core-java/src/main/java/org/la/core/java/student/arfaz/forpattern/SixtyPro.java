package org.la.core.java.student.arfaz.forpattern;

public class SixtyPro {

	public static void main(String[] args) {
		int n=17478,rem=0,sum=0;
		for(;n!=0;) {
		rem=n%10;
		sum=sum+rem;
			n=n/10;
    	
	}
	System.out.println(sum);
	}
//	find first and last digit of a number.
}
