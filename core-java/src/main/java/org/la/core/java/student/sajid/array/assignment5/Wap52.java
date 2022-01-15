package org.la.core.java.student.sajid.array.assignment5;

public class Wap52 {

	public static void main(String[] args) {
		// wap to add all elements of an array and check wether the sum is a prime number or not?
		// Suppose given array is [10, 19, 2, 7] -> sum=38 is not a prime number
		// Suppose given array is [10, 8, 2, 9] -> sum=29 is a prime number
		
		int arr[] = {10,19,2,7};
		int arr1[] = {10,8,2,9};
		int sum = 0;
		int sum1 = 0;
		boolean isPrime = false;
		boolean isPrime1 = false;
		
		for(int i=0;i<arr.length;i++) {
			 sum = sum + arr[i];
		}
		
		System.out.print("Sum of all elements in arr is "+sum);
		
		for(int i=2;i<=sum/2;i++) {
			int rem = sum%i;
			
			if(rem==0) {
				isPrime = true;
			}
		}
			
		
		if(isPrime) {
			System.out.println(" and its not a prime number");
		}else {
			System.out.println(" and its a prime number");
		}
		
		// second array checking
		for(int i=0;i<arr1.length;i++) {
			 sum1 = sum1 + arr1[i];
		}
		
		System.out.print("Sum of all elements in arr1 is "+sum1);
		
		for(int i=2;i<=sum1/2;i++) {
			int rem1 = sum1%i;
			
			if(rem1==0) {
				isPrime1 = true;
			}
		}
			
		
		if(isPrime1) {
			System.out.println(" and its not a prime number");
		}else {
			System.out.println(" and its a prime number");
		}
		

	}

}
