package org.jn.core.java.student.shoaeeb.linearsearch;

public class MaximumWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,2,3},
				{4,1,6},
				{9,2,3},
				{1,5,4},
				{11,11,11}
		};
		
		System.out.println(maximumWealth(arr));
	}
	
	static int maximumWealth(int arr[][])
	{
		int max=0;		
		for(int person=0; person<arr.length; person++)
		{
			int rowSum=0;
			for(int account=0; account<arr[person].length; account++)
			{
				rowSum+=arr[person][account];
			}
			if(rowSum>max)
			{
				max=rowSum;
			}
		}
		
		return max;
		
	}

}
