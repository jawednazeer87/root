package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * int average(int[])
   find the average of array elements and return average

 */
public class Program09AverageOfElements 
{

	public static void main(String[] args) 
	{
		int[] a = {10 , 20 , 30, 40, 50 ,50};
		int avg = average(a);
		System.out.println(avg);
	}
	
	static int average(int[] a)
	{
		int sum = 0;
		int avg = 0;
		
		for(int a1 : a)
		{
			sum += a1;
			avg = sum / a.length;
		}
		
		System.out.print("Average of elements is : ");
		return avg;
	}
}

