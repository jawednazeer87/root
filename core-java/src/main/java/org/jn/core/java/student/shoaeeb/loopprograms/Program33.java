package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,13,1,10,34,1};
		int size=arr.length;
		int smallest= Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int i=0; i<size; i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("smallest element is: "+smallest);
		
		for(int i=0; i<size; i++)
		{
			if(arr[i]<secondSmallest && arr[i]>smallest)
			{
				secondSmallest=arr[i];
			}
		}
		System.out.println("second smallest :" +secondSmallest);
		
	}

}
