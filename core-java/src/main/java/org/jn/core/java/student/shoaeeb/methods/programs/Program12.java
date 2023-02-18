package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program12 {
	//copy two arrays in to one
	static int[] copyArrays(int arr[],int srr[])
	{
		int newArray[]  = new int[arr.length+srr.length];
		int index=0;
		for(int ele: arr)
		{
			newArray[index]=ele;
			index++;
		}
		
		for(int ele: srr)
		{
			newArray[index]=ele;
			index++;
		}
		return newArray;
		
	}
	static void printArray(int arr[])
	{
		for(int ele: arr)
		{
			System.out.print(ele+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int srr[] = {6,7,8,9,10};
		int newArray[] = Program12.copyArrays(arr, srr);
		Program12.printArray(newArray);
	}

}
