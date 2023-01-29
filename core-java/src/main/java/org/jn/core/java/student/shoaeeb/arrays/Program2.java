package org.jn.core.java.student.shoaeeb.arrays;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
	static List<Boolean>kidsWithCandies(int candies[],int extraCandies)
	{
		List<Boolean> list = new ArrayList<>();
		
		//find max;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<candies.length; i++)
		{
			if(candies[i]>max)
			{
				max=candies[i];
			}
				
		}
		System.out.println(max);
		for(int i=0; i<candies.length; i++)
		{
			int candy = candies[i]+extraCandies;
			System.out.println(candy);
			if(candy>=max)
			{
				list.add(true);
			}
			else
				list.add(false);
			candy=0;
		}
		
		return list;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int candies[] = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> list = kidsWithCandies(candies,extraCandies);
		System.out.println(list);
	}

}
