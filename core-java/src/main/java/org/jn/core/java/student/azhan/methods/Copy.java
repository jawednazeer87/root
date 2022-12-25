package org.jn.core.java.student.azhan.methods;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {43,5,6,7,24,3};
		int arr2[] = new int[arr1.length];
		copy(arr1,arr2);
		for(int i=0; i<arr2.length; i++)
			System.out.println("arr2["+i+"] = "+arr2[i]);
	}
	static void copy(int arr1[], int arr2[]) {
		for(int i=0; i<arr1.length; i++)
			arr2[i] = arr1[i];
	}

}
