package org.jn.core.java.student.shoaeeb.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program10 {
	//remove duplicate elements from sorted array;
	
	static void removeDuplicate(int arr[])
	{
		Set<Integer> set = new HashSet<>();
		for(int ele:arr)
		{
			set.add(ele);
		}
		int i=0;
		int newArr[] = new int[set.size()];
		for(int ele: set)
		{
			newArr[i++]=ele;
		}
		System.out.println(Arrays.toString(newArr));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,2,3,4,5,5,10,10};
		removeDuplicate(arr);
		
	}

}
