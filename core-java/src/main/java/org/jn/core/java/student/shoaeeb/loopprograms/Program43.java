package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	43)	wap to multiply 3 to each element of an array
		int arr[]= {1,2,3,4,5};
		System.out.println("Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=arr[i]*10;
		}
		System.out.println();
		System.out.println("After multiplying *10");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
