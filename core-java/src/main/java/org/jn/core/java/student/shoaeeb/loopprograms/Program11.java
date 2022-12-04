package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	11) wap to copy one array into other array
		int arr[]= {1,2,3,4,5};
		int arr1[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			arr1[i]=arr[i];
		}
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}
