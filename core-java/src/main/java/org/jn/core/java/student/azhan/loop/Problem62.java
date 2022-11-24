package org.jn.core.java.student.azhan.loop;

public class Problem62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1221, rev=0;
		int n = num;
		while(num != 0)
		{
			rev = (num%10) + rev*10;  
			num/=10;
		}
		if(rev==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
