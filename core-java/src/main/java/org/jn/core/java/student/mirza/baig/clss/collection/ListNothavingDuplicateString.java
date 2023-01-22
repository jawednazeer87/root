package org.jn.core.java.student.mirza.baig.clss.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNothavingDuplicateString {

	
	public static List<String> removeDuplicates(List<String> stringlist){
		
		List<String > newList = new ArrayList<>();
		for (String element :stringlist) {
			
			if (! newList.contains(element)) {
				
				newList.add(element);
			}
		}
		return newList;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 List<String> stringlist = Arrays.asList(new String[]{"abc", "xyz", "abcd", "abc", "hello", "world", "bike", "ant", "world"});
 
 System.out.println("list contains duplicates String  :"+stringlist);
 
 List<String > newList = removeDuplicates(stringlist);
 
 System.out.println("List contains no duplicates string :"+newList);
	}

}


//reate a list not having duplicate values from given list
//List<String> stringList = Arrays.asList(new String[]{"abc", "xyz", "abcd", "abc", "hello", "world", "bike", "ant", "world"});