package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,13,1,10,34,1};
		int size=arr.length;
		int greatest= Integer.MIN_VALUE;
		int secondGreatest=Integer.MIN_VALUE;
		
		for(int i=0; i<size; i++)
		{
			if(arr[i]>greatest)
			{
				greatest=arr[i];
			}
		}
		System.out.println("greatest element is: "+greatest);
		
		for(int i=0; i<size; i++)
		{
			if(arr[i]>secondGreatest && arr[i]<greatest)
			{
				secondGreatest=arr[i];
			}
		}
		System.out.println("second greatest :" +secondGreatest);
		
	}

}
