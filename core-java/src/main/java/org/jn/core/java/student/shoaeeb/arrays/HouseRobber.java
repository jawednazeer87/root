package org.jn.core.java.student.shoaeeb.arrays;

public class HouseRobber {
	static void houseRobber(int nums[])
	{
		int max=nums[0];
		int sum=0;
		for(int i=0; i<nums.length; i++)
		{
			sum=nums[i];
			for(int j=i+1; j<nums.length; j++)
			{
				sum+=nums[j];
				max=Math.max(sum, max);
			}
				
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,7,9,3};
		houseRobber(nums);
	}

}
