package org.la.core.java.student.arfaz.forpattern;


public class SixtyThreePro {
	public static void main(String[] args) {
		int n=121,rem=0,rev=0,temp=0;
		temp = n;
		for(;n!=0;) {
		rem=n%10;
		rev = rev*10+rem;
//		System.out.print(rev);
			n=n/10;
    	
	}
		if(rev==temp)
			System.out.println(rev+" is a palindrome");
		else
			System.out.println("\n"+rev + "is not a palindrome");
	}

}
