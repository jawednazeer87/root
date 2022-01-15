package org.la.core.java.student.sajid.array.assignment5;

public class Wap24 {

	public static void main(String[] args) {
		// wap to remove duplicate elements from an array?
		
		 int[] arr = {1,1,1,2,3,4,5,5,6,8,10};
		 int j = 0;

	        for (int i = 0; i < arr.length-1; i++) {
	            if(arr[i]!=arr[i+1]) {
	            	arr[j++]=arr[i];
	            }	         
	        }
	        arr[j++] = arr[arr.length-1]; 
	        
	        for (int i=0; i<arr.length; i++) { 
	            System.out.print(arr[i]+" ");  
	     }  
	}

}
