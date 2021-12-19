	package org.la.core.java.student.arfaz.forpattern;

//Wap to check whether a number is Perfect number or not.
public class SeventyTwoPro {
	public static void main(String[] args) {
		int n=28,s=0,temp=0;
		temp=n;
		for(int i=1;i<n;i++)  {
		if(n%i==0)
			s+=i;
//		System.out.println(s);
//		System.out.println(i);
		}
		if(temp==s)
			System.out.println(temp+" is Perfect number");
		else
			System.out.println("not a perfect");
		
	}

		
	
		
}
