package org.jn.core.java.student.loop;

public class Program57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15642;
		int originalNum = n;
		int firstDigit = 0;
		int lastDigit = 0;
		
		//firstDigit = n%10;
		lastDigit = n%10;
		while(n!=0)
		{
			firstDigit = n%10;
			n=n/10;
		}
		int sum=firstDigit+lastDigit;
		System.out.println(sum);
	}

}
