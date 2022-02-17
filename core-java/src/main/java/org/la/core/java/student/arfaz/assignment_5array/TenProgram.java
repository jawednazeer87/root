package org.la.core.java.student.arfaz.assignment_5array;

// wap to print array in reverse order

public class TenProgram {

	public static void main(String[] args) {

		int arr[] = new int[5];
        for(int i=0,j=arr.length-1;i<arr.length&&j>=0;i++,j--) {
        	arr[i] = j;

        	System.out.println(arr[i]);
        }
        	
		
	}

}
