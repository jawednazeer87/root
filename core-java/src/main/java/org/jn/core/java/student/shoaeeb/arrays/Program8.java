package org.jn.core.java.student.shoaeeb.arrays;

import java.util.HashMap;
import java.util.Map;

public class Program8 {
	//count the number of good pairs
	static void countPairs(int arr[]) {
		int pairs=0;
		Map<Integer,Integer> hmm = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(!hmm.containsKey(arr[i]))
			{
				hmm.put(arr[i], 1);
			}
			else {
				int val=hmm.get(arr[i]);
				val++;
				hmm.put(arr[i],val);
			}
		}
		for(Map.Entry<Integer, Integer>  m : hmm.entrySet())
		{
			int val=m.getValue();
			if(val>1)
			{
				pairs+=val*(val-1)/2;
			}
		}
		System.out.println(pairs);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,1,1,3};
		int arr[] = {1,1,1,1};
		countPairs(nums);
		countPairs(arr);
	}

}
