package org.la.core.java.student.arfaz.assignment_5array;
//wap to print only positive number from an array

public class SixProgram {

	public static void main(String[] args) {

		int arr[] = new int[5];
        for(int i=0,j=-1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
//        	System.out.println("complete array arr[" + i + "] = "+arr[i]);
        	if(arr[i]>0)
        	System.out.println(arr[i]);
        }
        	
		
	}

}
