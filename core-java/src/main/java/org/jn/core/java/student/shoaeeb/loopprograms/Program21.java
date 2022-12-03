package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,6,7,9,13,14,15,16};
		
		for(int i=0; i<arr.length; i++)
		{
			int counter=0;
			for(int j=2; j<arr[i]; j++)
			{
				if(arr[i]%j==0)
				{
					counter=1;
					break;
				}
			}
			if(counter==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
