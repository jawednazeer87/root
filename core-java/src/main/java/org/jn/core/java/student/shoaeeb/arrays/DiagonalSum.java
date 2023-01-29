package org.jn.core.java.student.shoaeeb.arrays;

public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[][] = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<=i; j++)
			{
				sum+=arr[i][j];
			}
		}
		int j=arr.length-1;
		int i=0;
		while(j>=0)
		{
			if(i==j)
			{
				//do nothing
			}
			else 
				sum+=arr[i][j];
			
			i++;
			j--;
		}
		System.out.println(sum);
	}

}
