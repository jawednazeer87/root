package org.la.core.java.student.tanseer.assignment4.loops;

import java.util.Scanner;

public class Program58SwapFirstAndLastDigit {

	public static void main(String[] args) {
		
		Scanner sc	= new Scanner(System.in); 
		int count = 0 ;
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		
		int temp = num ;
		
		int lastDigit = num % 10 ;
		System.out.println("Last Digit is : \t"+ lastDigit);
		
		while(num > 10) 
		{
			count++ ;
			num = num / 10 ;		
		}
		
		int firstDigit = num;
		System.out.println("First Digit :  \t\t"+ firstDigit);
		
		num = temp;
		System.out.println("Original Number is : \t"+num);
		
		System.out.println("Count is : \t\t"+count);

		num = num / 10 ;
		System.out.println("Removing last digit : \t" +temp);
		
		int p = (int)Math.pow(10, count - 1); 			//To get middle numbers out
		int mid = num % p ;
		System.out.println("Mid Number is : \t" + mid);
		
		int x = firstDigit + mid * 10 + lastDigit * (int)Math.pow(10, count);
		System.out.println("After Swapping :\t"+ x);
	}
}