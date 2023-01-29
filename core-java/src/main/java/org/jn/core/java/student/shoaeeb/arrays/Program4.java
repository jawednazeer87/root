package org.jn.core.java.student.shoaeeb.arrays;

import java.util.HashMap;
import java.util.Map;

public class Program4 {
	//count the occurence of numbers
	
	static void countEleArr(int arr[])
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}

		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,2,5,6,3,6,6};
		countEleArr(arr);
	}

}
