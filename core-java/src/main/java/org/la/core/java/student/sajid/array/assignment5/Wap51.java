package org.la.core.java.student.sajid.array.assignment5;

public class Wap51 {

	public static void main(String[] args) {
		// wap to count all prime numbers of an array?
		// Suppose given array is [100, 19, 2, 7, 50] -> 19, 2, 7 
		// are prime numbers so the count = 3
		
		int arr[] = {100, 19, 2, 7, 50};
		int rem = 0;
		int count = 0;
	
		
		System.out.print("Number of prime num elements in arr is ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<=arr[i]/2;j++) {
				 rem = arr[i]%j;				
			}						
			if(rem==0) {
				count++;
			}
		}
		System.out.print(count);

	}

}
