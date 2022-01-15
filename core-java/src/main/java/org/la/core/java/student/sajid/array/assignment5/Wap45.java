package org.la.core.java.student.sajid.array.assignment5;

public class Wap45 {

	public static void main(String[] args) {
		// wap to add all even numbers of an array and print the sum
		//Suppose given array is [10, 19, 2, 7] -> sum=12 which is sum of 10 and 2, both are even
		
		int arr[] = {10, 19, 2, 7};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0)
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of all even numbers in array arr is: "+sum);


	}

}
