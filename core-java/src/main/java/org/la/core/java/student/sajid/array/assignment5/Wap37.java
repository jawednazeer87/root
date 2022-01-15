package org.la.core.java.student.sajid.array.assignment5;

public class Wap37 {

	public static void main(String[] args) {
		// wap to separate even and odd numbers of a given array of integers. 
		//Put all even numbers first, and then odd numbers ?
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int a[] = new int [10];
		int ctr = 0;

		
		//print values from the array
		for(int i=0;i<arr.length;i++) {
		System.out.println("Before arr["+i+"]: "+arr[i]);
		}	
		
		for(int i=0;i<arr.length;i++) {
			int rem = arr[i]%2;
			
			if(rem==0) {
				a[ctr]=arr[i];
				ctr++;			
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			int rem = arr[i]%2;
			
			if(rem!=0) {
				a[ctr]=arr[i];
				ctr++;
			}
		}
		
		//print values from the array
		for(int i=0;i<arr.length;i++) {
		System.out.println("After arr["+i+"]: "+a[i]);
		}	

	}

}
