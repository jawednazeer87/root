package org.jn.core.java.student.shoaeeb.arrays;

public class MaximumSubArray {
	
	static void findMax(int nums[])
	{	
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++)
		{
			sum+=nums[i];
			max=Math.max(sum, max);
			
			if(sum<0)
			{
				sum=0;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		findMax(nums);
	}

}
