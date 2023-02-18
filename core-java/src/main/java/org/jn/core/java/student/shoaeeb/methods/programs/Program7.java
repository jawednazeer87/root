package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program7{
	//copy first array to second array and return the array
	static int[]copyArray(int arr[])
	{
		int newArray[] =  new int[arr.length];
		int index=0;
		for(int ele: arr)
		{
			newArray[index++]=ele;
		}
		return newArray;
	}
	static void printArray(int arr[])
	{
		for(int ele: arr)
		{
			System.out.println(ele);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,9};
		int newArray[] = Program7.copyArray(arr);
		Program7.printArray(newArray);
	}

}
