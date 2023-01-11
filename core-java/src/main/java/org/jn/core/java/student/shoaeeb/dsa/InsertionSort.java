package org.jn.core.java.student.shoaeeb.dsa;

public class InsertionSort {
	void insertionSort(int arr[],int n)
	{
		for(int i=1; i<n; i++)
		{
			int current=arr[i];
			int j=i-1;
			while(arr[j]>current && j>=0)
			{
				arr[j+1]=arr[j];
				j--; 
			}
			arr[i+1]=current;
		}
	}
	
	void printArray(int arr[],int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
