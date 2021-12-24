package org.la.core.java.student.arfaz.forpattern;


public class SixtyFSevenPro {
	public static void main(String[] args) {
		int n=6,count=0;
		for(int i=1;i<=n;i++) {
		if(n%i==0)
			count++;
		}
		if(count==2)
		System.out.println("Prime number");
		else
			System.out.println("It is not a prime");
	}
}
//check whether a number is Prime number or not.