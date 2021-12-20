package org.la.core.java.student.majeed.assignment4;

public class Program62 {

	public static void main(String[] args) {
		// 62.	Wap to check whether a number is palindrome or not.
		int ip = 12321, op = 0, i, temp;
		temp = ip;
		while(ip>0) {
			i = ip%10;
			op = op*10+i;
			ip = ip/10;
			
		}
		if(op==temp) {
			System.out.println("Number is a palindrome");
		}
		else
			System.out.println("Number is not a palindrome");
		
	}

}
