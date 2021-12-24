package org.la.core.java.student.arfaz.assignment_5;

// wap to find greatest number from any array 

public class ForteenProgram {

	public static void main(String[] args) {

		int arr[] = new int[5], max=0;
		
		for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
            	
        }
		 for(int j=0;j<arr.length;j++) {
			if(arr[j]>arr[arr.length-1])
			 max = arr[j];
			else if(arr[j]<arr[arr.length-1])
				max = arr[arr.length-1];
			}
		 System.out.println(max);
	}

}
