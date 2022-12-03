package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	45) wap to add all even numbers of an array and print the sum
		int arr[]= {1,2,3,4,5};
		int sumEven=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sumEven+=arr[i];
			}
		}
		System.out.println(sumEven);
		
	}

}
