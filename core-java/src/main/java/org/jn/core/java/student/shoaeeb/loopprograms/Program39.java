package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println("Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=arr[i]-1;
		}
		System.out.println();
		System.out.println("After Subtracting -1");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
