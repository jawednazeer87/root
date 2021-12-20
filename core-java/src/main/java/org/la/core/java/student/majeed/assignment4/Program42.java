package org.la.core.java.student.majeed.assignment4;

public class Program42 {

	public static void main(String[] args) {
		// 42.	wap to find given number is prime or not
		int i = 1, j = 61;
		boolean k = true;
		while(i<=j) {			
			
			if(i!=1 && i!=j && j%i==0) {
				k = false;
				break;
			}
			i++;
			
		}
		
		if (k==true) 
			System.out.println("j is prime");
		else
			System.out.println("j is not a prime");
		
	}

}
