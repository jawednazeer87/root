package org.la.core.java.student.arfaz.assignment_5;


//  wap to add two array elements n copy into third array

public class EighteenProgram {

	public static void main(String[] args) {

		int arr[] = new int[4];
		int arr1[] = new int[4];
		int res[] = new int[4];
		
		for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
        	arr1[i] = j;
//        	System.out.println("Array = "+arr[i]);
            res[i] = arr[i]+arr1[i];	
        }
		
		
		for(int a:res)
		System.out.print(a+" ");
	}

}
