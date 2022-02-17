package org.la.core.java.student.arfaz.assignment_5array;


//  wap to copy two arrays into one array

public class SeventeenProgram {

	public static void main(String[] args) {

		int arr[] = new int[4];
		int arr1[] = new int[4];
		int res[] = new int[8];
		int temp =0;
		for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
        	arr1[i] = j;
//        	System.out.println("Array = "+arr[i]);
            	
        }
		for(int i=0;i<arr.length;i++) {
			res[i] = arr[i];
			temp++; //after filling array upto 4 indexes in res[] we will use temp as index from res[temp] so that we can fill res
			System.out.println(temp);
		}
		for(int i=0,j=temp;i<arr1.length&&j<res.length;i++,j++) {
			res[j] = arr1[i];         
		}
		for(int a:res)
		System.out.print(a+" ");
	}

}
