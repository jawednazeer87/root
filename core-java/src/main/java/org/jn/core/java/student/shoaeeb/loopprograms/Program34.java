package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program34 {

	
	static int [] removeZeroes(int arr[])
	{
		int size=0;
		for(int a:arr)
		{
			if(a!=0)
			{
				size++;
			}
		}
		
		int newArray[] = new int[size];
		int i=0;
		for(int a:arr)
		{
			if(a!=0)
			{
				newArray[i++]=a;
			}
		}
		return newArray;
	}
	static void printArray(int arr[])
	{
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = removeZeroes(new int[]{7,1,2,0,1,5,6,1,0,22,11,9});
		printArray(a);
	}

}
