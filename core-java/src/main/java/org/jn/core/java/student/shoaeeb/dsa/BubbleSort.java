package org.jn.core.java.student.shoaeeb.dsa;

public class BubbleSort {
	
	//member method
//    Total number of swaps = Total number of comparison
//    Total number of comparison (Worst case) = n(n-1)/2
//    Total number of swaps (Worst case) = n(n-1)/2
//
//    Worst and Average Case Time Complexity: O(N2). The worst case occurs when an array is reverse sorted.
//    Best Case Time Complexity: O(N). The best case occurs when an array is already sorted.
//    Auxiliary Space: O(1)
	void bubbleSort(int arr[],int n)
	{
		int counter=1;
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
	void printArray(int arr[],int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
