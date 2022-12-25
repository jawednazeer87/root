package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	40)	wap to add 5 to each element of an array
		int arr[]= {1,2,3,4,5};
		System.out.println("Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=arr[i]+5;
		}
		System.out.println();
		System.out.println("After adding +5");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
