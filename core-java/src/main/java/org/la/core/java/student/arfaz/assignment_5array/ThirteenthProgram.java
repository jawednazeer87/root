package org.la.core.java.student.arfaz.assignment_5array;

// wap to find some of an array element

public class ThirteenthProgram {

	public static void main(String[] args) {

		int arr[] = new int[5], sum=0;
		
		int n = arr.length;
		for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
        	sum = sum+arr[i];
        	 System.out.println(sum);
        }
		 System.out.println(sum);
	}

}
