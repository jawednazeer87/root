package org.la.core.java.student.arfaz.assignment_5;
//wap to print only odd numbers from an array

public class FourProgram {

	public static void main(String[] args) {

		int arr[] = new int[50];
        for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
        	if(arr[i]%2!=0)
        	System.out.println(arr[i]);
        }
        	
		
	}

}
