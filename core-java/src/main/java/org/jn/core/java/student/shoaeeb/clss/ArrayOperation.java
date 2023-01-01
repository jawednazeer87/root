package org.jn.core.java.student.shoaeeb.clss;

public class ArrayOperation {
	//copy one array to another
	public int[] copy(int []a)
	{
		int b[] = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		return b;
	}
	//reverse the array
	public int []reverse(int []b)
	{
		for(int i=0; i<b.length/2; i++)
		{
			int temp=b[i];
			b[i]=b[b.length-1-i];
			b[b.length-1-i]=temp;
		}
		return b;
	}
	//sum of two array
	public int []addTwoArrays(int a[],int b[])
	{
		int c[]=new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i]+b[i];
		}
		return c;
	}
	
	//printing an array;
	public void print(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	//sum of array
	public int sumArray(int []a)
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	//find max element in array
	public int findMax(int a[])
	{
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	//find min in array
	public int findMin(int a[])
	{
		int min=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
	
}
