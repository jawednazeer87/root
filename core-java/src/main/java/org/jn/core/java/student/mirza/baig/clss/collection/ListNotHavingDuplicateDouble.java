package org.jn.core.java.student.mirza.baig.clss.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNotHavingDuplicateDouble {

	public static List<Double>  removeDuplicates(List<Double> ss) {
		
	List<Double > newList = new ArrayList<>();   // new list create 
	
	for (Double element : ss) {  // for eah called for triverse the  first list 
		
		if (! newList.contains(element)) {  // if condition set for if element not present then add it
			 newList.add(element);
			
		}
	}
		return newList;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> ss = Arrays.asList(new Double[]{4.5, 3.2, 6.5, 99.0, 33.21, 5.53, 4.33, 4.5, 3.2, 6.5, 1.1, 1.2, 4.4});
		
		System.out.println("Duplicate :"+ss);
		
		List<Double> newList = removeDuplicates(ss);
		
		System.out.println("removed duplicate :"+newList);
		

	}

}

//Create a list not having duplicate values from given list
//List<Double> ss = Arrays.asList(new Double[]{4.5, 3.2, 6.5, 99.0, 33.21, 5.53, 4.33, 4.5, 3.2, 6.5, 1.1, 1.2, 4.4});

