package org.jn.core.java.student.shoaeeb.arrays;

import java.util.Arrays;

public class LuckyNumber {
	static void luckyNumber(int nums[][])
	{
		int ans=0;
		int res[] = new int[nums.length];
		int result[] = new int[nums.length];
		
		for(int i=0; i<nums.length; i++)
		{
			ans=Integer.MAX_VALUE;
			for(int j=0; j<nums[i].length; j++)
			{
			 if(ans>nums[i][j])
			 {
				 res[i]=nums[i][j];
				 ans=nums[i][j];
			 }
			}
		}
		for(int i=0; i<nums.length; i++)
		{
			ans=Integer.MIN_VALUE;
			for(int j=0; j<nums.length; j++)
			{
				if(nums[j][i]>ans)
				{
					result[i]=nums[j][i];
					ans=nums[j][i];
				}
			}
		}
//		System.out.println(Arrays.toString(res));//row
		ans=res[0];
		for(int i=1; i<res.length; i++)
		{
			ans=Math.max(ans, res[i]);
		}
		
		int min=result[0];
		for(int i=1; i<result.length; i++)
		{
			ans=Math.min(min, result[i]);
		}
		System.out.println(ans+ " "+min);
//		System.out.println(Arrays.toString(result));//column
		//find the min
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][] = {{3,7,8},{9,11,13},{15,16,17}};
		int nums2[][] = {{7,8},{1,2}};
		luckyNumber(nums);
	}

}
