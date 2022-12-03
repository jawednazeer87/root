package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	48)	wap to count all 2's of an int array
		int arr[]= {1,2,3,4,5,2,2};
		int count=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==2)
			{
				count++;
			}
		}
		
		System.out.println("Count of 2: "+count);
	}

}
