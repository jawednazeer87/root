package org.la.core.java.student.arfaz.assignment_5array;

// wap to print number divisible by given number from an array

public class EightProgram {

	public static void main(String[] args) {

		int arr[] = new int[5];
        for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;

        	if(arr[i]%2==0)
        	System.out.println(arr[i]);
        }
        	
		
	}

}