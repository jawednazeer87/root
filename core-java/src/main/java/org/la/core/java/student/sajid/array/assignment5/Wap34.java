package org.la.core.java.student.sajid.array.assignment5;

public class Wap34 {

	public static void main(String[] args) {
		// wap to remove all zero element from an array?
		
		int arr[] = {0,1,0,0,0,3,5,0};		
		int j = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		}
		
		int a[] = new int [j];
		
		System.out.println("count: "+a.length);
		
		for(int i=0;i<a.length;i++) {
			a[i] = arr[i];			
		}

		//print values from the array
		for(int i=0;i<a.length;i++) {
		System.out.println("After arr a["+i+"]: "+a[i]);
		}	

	}

}
