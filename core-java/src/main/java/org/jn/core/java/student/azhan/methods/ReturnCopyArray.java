package org.jn.core.java.student.azhan.methods;

public class ReturnCopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {43,5,6,7,24,3};
		int arr2[] = copy(arr1);
		
		for(int i=0; i<arr2.length; i++)
			System.out.println("arr2["+i+"] = "+arr2[i]);
	}
	static int[] copy(int arr[])
	{
		int temp[] = new int[arr.length];
		for(int i=0; i<arr.length; i++)
			temp[i] = arr[i];
		return temp;
	}

}
