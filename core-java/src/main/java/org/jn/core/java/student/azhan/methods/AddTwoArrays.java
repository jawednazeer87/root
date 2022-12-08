package org.jn.core.java.student.azhan.methods;

public class AddTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {7,5,3,2,3,4};
		int arr2[] = {5,8,4,3,2,6};
		int arr3[] = addTwoArrays(arr1,arr2);
		for(int x:arr3)
			System.out.print(x+", ");
		
	}
	static int[] addTwoArrays(int arr1[], int arr2[])
	{
		int arr3[] = new int[arr1.length];
		for(int i=0; i<arr1.length; i++)
			arr3[i] = arr1[i] + arr2[i];
		return arr3;
	}

}
