package org.la.core.java.student.hasan.assignment04;

public class Loop62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12321, rev=0 , temp=n;
		while(temp!=0) {
			int rem= temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
			System.out.println(n+" is palindrome");
		else
			System.out.println(n+" is not palindrome");
	}

}
