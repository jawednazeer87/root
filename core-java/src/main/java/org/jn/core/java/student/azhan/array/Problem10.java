package org.jn.core.java.student.azhan.array;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,7,-6,4,-3,2,0};
		System.out.println("Array before reverse");
		for(int i=0; i<arr.length; i++)
			System.out.print(+arr[i]+", ");
		System.out.println();
		System.out.println("Array in reverse");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[arr.length-1-i]+", ");
	}

}
