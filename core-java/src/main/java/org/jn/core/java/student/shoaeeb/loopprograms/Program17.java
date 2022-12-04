package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int size=arr.length;
		
		int arr1[]= {6,7,8,9,10};
		int sizeArr=arr1.length;
		int newSize= size+sizeArr;

		int arr2[] = new int[newSize];
		int j=0;
		int i=0;
		while(j<arr.length)
		{
			arr2[j]=arr[i];
			j++;
			i++;
		}
		 i=0;
		while(i<arr1.length)
		{
			arr2[j]=arr1[i];
			j++;
			i++;
		}
		for(i=0; i<newSize; i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
