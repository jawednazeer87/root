package org.jn.core.java.student.azhan.array;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		System.out.println("Array before reverse:");
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"] = "+arr[i]);
		for(int i=0; i<arr.length; i++)
			arr[i] = arr[arr.length-1-i];
		System.out.println("\nArray after reverse:");
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"] = "+arr[i]);
		
	}

}
