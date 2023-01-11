package org.jn.core.java.student.shoaeeb.dsa;

public class ReverseArray {

	public static int [] reverseArray(int arr[],int n)
	{
		for(int i=0; i<n/2; i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {1,2,3,4,5};
			PrintArray pr = new PrintArray();
			System.out.println("Original Array: ");
			pr.printArray(arr, arr.length);
			arr = reverseArray(arr,arr.length);
			System.out.println("\nReverse Array: ");
			pr.printArray(arr, arr.length);

			
	}

}
