package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12) wap to copy an array to another array in reverse order
		
		int arr[]= {1,2,3,4,5};
		int arr1[]= new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			arr1[j]=arr[i];
			j++;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
