package org.la.core.java.student.tanseer.assignment6.methods;

/*
 *  void printNum(int[], int)
		method will print number if found in array negative number from supplied array

 */
public class Program05PrintNum 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,2,1,3,4,5,6,7,8,9,10};
		printNum(arr, 18);
		
	}
	

	static void printNum(int[] arr, int num)
	{
		boolean value = false;
		
		for(int a : arr)
		{
			if(a == num)
			{
				value = true;
				break;
			}
		}
		
		if(value == false)
		{
			System.out.println("Element "+num+" not found ");
		}
		else
		{
			System.out.println("Element "+num+" found");
		}
	}
}

