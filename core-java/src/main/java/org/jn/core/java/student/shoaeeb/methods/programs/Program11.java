package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program11 {
	//find the smallest element in the array
	static int smallest(int arr[])
	{
		int min=Integer.MAX_VALUE;
		for(int ele: arr)
		{
			if(min>ele)
			{
				min=ele;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,-1,6,3};
		int smallest=Program11.smallest(arr);
		System.out.println("Smallest element in the array is: "+smallest);
	}

}
