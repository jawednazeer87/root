package org.la.core.java.student.sajid.array.assignment5;

public class Wap32 {

	public static void main(String[] args) {
		// wap to find the second largest element in an array?
		
		int arr[] = {30, -20, 0,100};
		int temp = arr[0];
		int temp1 = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if (temp<arr[i] ) {
				temp = arr[i];
			}					
		}
		
		for(int i=0;i<arr.length;i++) {
			if (temp1<arr[i]&& arr[i]!=temp ) {
				temp1 = arr[i];
			}	
		}

		System.out.print("Second greatest number in int array is: "+temp1);
	}

}