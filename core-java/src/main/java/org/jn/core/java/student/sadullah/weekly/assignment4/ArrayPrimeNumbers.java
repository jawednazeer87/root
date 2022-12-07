package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayPrimeNumbers {
	public static void main(String[] argrs) {
		int a [] = {1, 2, 3, 4, 5};

		for (int i = 0; i < a.length; i++) {
	        boolean isPrime = true;
	        if (a[i] == 1)
	            isPrime = false;
	        else {
	            // check to see if the numbers are prime
	            for (int j = 2; j <= a[i] / 2; j++) {
	                if (a[i] % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        // print the number
	        if (isPrime){
	            if (a[i] == 0){}
	            else {
	                System.out.print(a[i] + " , ");
	            }
	    }}
	    System.out.println(" are the prime numbers in the array ");
	}
}
