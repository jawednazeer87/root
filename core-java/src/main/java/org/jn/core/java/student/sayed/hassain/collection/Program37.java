package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program37 {
	//list does not contain duplicate values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =  Arrays.asList(new Integer[] {1,2,3,5,5,1,0,-1,-2,-3,1,0,-1,-3});
		//make a list which does not contain duplicate values
		Set<Integer> set = new HashSet<>();
		
		for(int ele: list)
		{
			set.add(ele);
		}
		
		List<Integer> newList = new ArrayList<>(set);
		
		//printing the newList
		
		for(int ele: newList)
		{
			System.out.print(ele+" ");
		}
	}

}
