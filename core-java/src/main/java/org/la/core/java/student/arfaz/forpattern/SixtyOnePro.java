package org.la.core.java.student.arfaz.forpattern;

public class SixtyOnePro {
	public static void main(String[] args) {
		int n=17568,rem=0,mul=1;
		
		for(;n!=0;) {
		rem=n%10;
		mul=mul*rem;
			n=n/10;
    	
	}
	System.out.println(mul);
	}
//	calculate product of digits of a number.
}
