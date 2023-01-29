package org.jn.core.java.student.shoaeeb.arrays;

public class Program9 {
	//numbers smaller than current number
	static void countNumbers(int nums[])
	{
		int newArray[] = new int[nums.length];
		for(int i=0; i<nums.length; i++)
		{
			int count=0;
			for(int j=0; j<nums.length; j++)
			{
				if(nums[i]>nums[j])
				{
					count++;
				}
				newArray[i]=count;
			}
		}
		
		for(int ele:newArray)
		{
			System.out.println(ele);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {8,1,2,2,3};
		countNumbers(nums);
	}

}
