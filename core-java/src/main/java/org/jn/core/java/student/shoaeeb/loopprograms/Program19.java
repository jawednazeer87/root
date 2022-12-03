package org.jn.core.java.student.shoaeeb.loopprograms;

public class Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,1,2};
		int count=1;
		for(int i=0; i<arr.length; i++)
		{
			count=0;
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
