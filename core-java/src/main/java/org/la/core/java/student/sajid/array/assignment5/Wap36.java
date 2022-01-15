package org.la.core.java.student.sajid.array.assignment5;

public class Wap36 {

	public static void main(String[] args) {
		// wap to remove the duplicate elements of a given array and 
		//return the new length of the array.Sample array: [20, 20, 30, 40, 50, 50, 50]
		//After removing the duplicate elements the program 
		//should return 4 as the new length of the array?

		int arr[] = {20, 20, 30, 40, 50, 50, 50};
		int arr1[] = new int [4];
		int j = 0;
		
		//print values from the array
		for(int i=0;i<arr.length;i++) {
		System.out.println("Before arr["+i+"]: "+arr[i]);
		}	
		
		   for (int i = 0; i < arr.length-1; i++) {
	            if(arr[i]!=arr[i+1]) {
	            	arr1[j++]=arr[i];
	            }	         
	        }
	        arr1[j++] = arr[arr.length-1]; 
	        
	     // Changing the original array
	        for (int i = 0; i < j; i++) {
	            arr[i] = arr1[i];
	        }
	  
	        
	        for (int i=0; i<arr1.length; i++) { 
	            System.out.print(arr1[i]+" ");
	        }
	        
	        System.out.println("Size ofnew array is: "+arr1.length);
		
	}

}
