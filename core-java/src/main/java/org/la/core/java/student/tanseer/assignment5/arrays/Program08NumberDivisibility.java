package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program08NumberDivisibility 
{

	public static void main(String[] args) 
	{
		int num = 5;
		int arr[] = new int[40];
		
		System.out.println("The array which are divisible by "+num +" are :");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = i + 1;
			
			if(arr[i] % num == 0)
			{
				System.out.print(" "+arr[i]);
			}
		}
		
	}

}
