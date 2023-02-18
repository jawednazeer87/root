package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program10 {
	//find the greatest element in the array
	static int greatest(int arr[])
	{
		int max=Integer.MIN_VALUE;
		for(int ele: arr)
		{
			if(ele>max)
			{
				max=ele;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,6,1,2};
		int greatest=Program10.greatest(arr);
		System.out.println("Greatest element in the array: "+greatest);
	}

}
