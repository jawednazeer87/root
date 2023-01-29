package org.jn.core.java.student.shoaeeb.arrays;

public class Program6 {

	static void shuffleArray(int arr[],int n)
	{
		int newArr[] = new int[2*n];
		for(int i=0; i<n; i++)
		{
			newArr[2*i]= arr[i];
			newArr[2*i+1]=arr[n+i];
		}
			
		
		for(int ele: newArr)
		{
			System.out.println(ele);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int n=3;
		shuffleArray(arr,n);
	}

}
