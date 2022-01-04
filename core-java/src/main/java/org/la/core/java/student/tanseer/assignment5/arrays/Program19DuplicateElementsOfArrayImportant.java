package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program19DuplicateElementsOfArrayImportant 
{

	public static void main(String[] args) 
	{
		int[] a = {30, 10, 20, 30, 40, 50, 60, 70, 80, 30 , 40, 80, 20, 30, 50};
//		//Frequency array
		int[] f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1 , -1, -1, -1, -1, -1};
		
//		int[] a = {30, 10, 20, 30};
//		//Frequency array
//		int[] f = {-1, -1, -1, -1};
		
		for(int i = 0; i < a.length; i++) // loop to check first element
		{
			int count = 1;
			
			for(int j = i+1; j < a.length; j++) // inner loop to compare array elements
			{
				if(a[i] == a[j])
				{
					count++;
					f[j] = 0; // if found duplicate element replace it with 0
				}
			}
			
			if(f[i] != 0)
			{
				f[i] = count;
			}
		}
		
		int temp[] = new int[a.length];
		int k = 0;
		
		for(int i = 0; i < a.length; i++) // printing the final result loop
		{
			if(f[i] != 0)
			{
				//System.out.println(a[i]+" comes "+f[i]+" times"); // printing frequency
				temp[k] = a[i];
				k++;
			}
		}
		
		System.out.println("Original array : ");
		for(int i = 0; i < a.length; i++) // original array;
		{
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		System.out.println("Duplicate elements removed :");
		
		for(int i = 0; i < k; i++)
		{
			System.out.print(temp[i]+" ");
		}
	}	
}
