package org.jn.core.java.student.shoaeeb.arrays;

import java.util.Arrays;

public class SortColors {
	//number 0 represent red
	//number 1 represent white
	//number 2 represent blue
	
	static void sortColors(int nums[])
	{
		int counter=1;
        int n=nums.length;
        while(counter<n-1)
        {
            for(int i=0; i<n-counter; i++)
            {
                if(nums[i]>nums[i+1])
                {
                   int temp=nums[i];
                   nums[i]=nums[i+1];
                   nums[i+1]=temp; 
                }
            }
            counter++;
        }
        System.out.println(Arrays.toString(nums));
    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,0,0,2,2};
		sortColors(arr);
	}

}
