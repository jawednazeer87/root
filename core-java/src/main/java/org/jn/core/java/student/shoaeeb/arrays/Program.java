package org.jn.core.java.student.shoaeeb.arrays;

public class Program {

	static int[] getConcatanation(int[]arr)
	{
		int n=arr.length;
		int newArr[]= new int[n+n];
		
		for(int i=0; i<n; i++)
		{
			newArr[i]=arr[i];
		}
		for(int i=0; i<arr.length; i++)
		{
			newArr[n+i]=arr[i];
		}
		return newArr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		arr=getConcatanation(arr);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
}

}
