package org.la.core.java.student.arfaz.forpattern;

public class FiftySixPro {

	public static void main(String[] args) {
		int n=18560,count=0,rem=0;
		for(;n!=0;) {
		rem = n%10;
		count++;
		n=n/10;
    	
	}
		System.out.println(count);
	}
//	count number of digits in a number
}
