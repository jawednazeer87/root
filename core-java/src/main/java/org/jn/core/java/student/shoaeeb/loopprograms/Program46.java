package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	46)	wap to add all odd numbers of an array and print the sum
		int arr[]= {1,2,3,4,5};
		int sumOdd=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				sumOdd+=arr[i];
			}
		}
		System.out.println(sumOdd);
	}

}
