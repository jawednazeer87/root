package org.la.core.java.student.majeed.methods;

//wap to compute the sum of the digits in an integer

public class Program1 {

	public static void main(String[] args)
    {
      System.out.println("The sum is " + sumDigits(56));
    }

 public static int sumDigits(int n) {
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}
	
 }