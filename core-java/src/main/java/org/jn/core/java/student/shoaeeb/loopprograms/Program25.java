package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int size=arr.length;
		int avg=0;
		int sum=0;
		for(int i=0; i<size; i++)
		{
			sum+=arr[i];
		}
		
		avg=sum/size;
		System.out.println(avg);
	}

}
