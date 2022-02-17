package org.la.core.java.student.arfaz.assignment_5array;

// wap to copy one array into other array

public class ElevenProgram {

	public static void main(String[] args) {

		int arr[] = new int[5];
		int b[] = new int[5];
		for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
        	b[i] = arr[i];
 
        	System.out.println(b[i]);
        }
        	
		
	}

}
