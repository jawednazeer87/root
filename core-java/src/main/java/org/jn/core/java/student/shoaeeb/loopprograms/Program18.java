package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	18) wap to add two array elements n copy into third array
		
		int arr[]= {1,2,3,4,5};
		int arr1[]= {6,7,8,9,10};
		int size=arr.length;
		int arr2[] = new int[size];
		for(int i=0; i<size; i++)
		{
			arr2[i]=arr[i]+arr1[i];		
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(arr2[i]+ " ");
		}
	}

}
