package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program1 {
	//print negative from array
	static void printNegative(int arr[])
	{
		for(int ele: arr)
		{
			if(ele<0)
			{
				System.out.print(ele+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,-1,-6,7};
		Program1.printNegative(arr);
		
	}

}
