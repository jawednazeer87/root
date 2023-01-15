package org.jn.core.java.student.shoaeeb.practiceset;

public class Program9 {
	public static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	//sort an array using insertion sort
	public static void insertionSort(int arr[])
	{
		int n=arr.length;
		for(int i=1; i<n; i++)
		{
			int current=arr[i];
			int j=i-1;
			while(arr[j]>current && j>=0)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
	}
	//sort an array using bubble sort
	public static void bubbleSort(int arr[])
	{
		int counter=1;
		int n=arr.length;
		while(counter<n-1)
		{
			for(int i=0; i<n-counter; i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			counter++;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,4,2,6};
		//bubbleSort(arr);
		insertionSort(arr);
		printArray(arr);

	}

}
