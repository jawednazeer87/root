package org.la.core.java.student.arfaz.assignment_5;

// wap to copy an array to another array in reverse order

public class TwelveProgram {

	public static void main(String[] args) {

		int arr[] = new int[5];
		int b[] = new int[5];
		int n = arr.length;
		for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
            b[i]=arr[i];
        }
        for(int k=arr.length-1;k>=0;k--)  {
        	System.out.println(b[k]);
        }
		
	}

}
