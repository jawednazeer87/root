package org.jn.core.java.student.mirza.baig.clss.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNotHavingDuplicate {
	
	public static List<Integer> removeDuplicates(List<Integer> ss) {
		// TODO Auto-generated method stub
		List<Integer> newlist = new ArrayList<>();

		for (Integer element: ss) {
		
		 if (!newlist.contains(element)) {
		newlist.add(element);
		}
	
		}
	
	return newlist;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> ss = Arrays.asList(new Integer[]{1, 2, 3, 5, 5, 1, 0, -1, -2, -3, 1, 0, -1, -3});
		
		System.out.println("List contains duplicate element :"+ss);
		
		List<Integer> newlist=removeDuplicates(ss);
		
		System.out.println("list not contains dupliatre :"+newlist);
		



}

	
	}


//Create a list not having duplicate values from given list 
//List<Integer> ss = Arrays.asList(new Integer[]{1, 2, 3, 5, 5, 1, 0, -1, -2, -3, 1, 0, -1, -3});