package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * int sum(int[])
	find sum of all elements of an array and return sum

 */
public class Program08SumOfElements 
{

	public static void main(String[] args) 
	{
		int[] a = {10 , 20 , 30, 40, 50};
		int c = sum(a);
		System.out.println(c);
	}
	
	static int sum(int[] a)
	{
		int sum = 0;
		for(int i = 0; i < a.length ; i++)
		{
			sum += a[i];
		}
		System.out.print("sum of elements is : ");
		return (sum);
	}
	
}

