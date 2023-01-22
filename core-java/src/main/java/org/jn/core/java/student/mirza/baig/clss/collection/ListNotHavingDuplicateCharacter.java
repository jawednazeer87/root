package org.jn.core.java.student.mirza.baig.clss.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNotHavingDuplicateCharacter {

	public static List<Character> removeDuplicates(List<Character> ss){
		
		List<Character> newList = new ArrayList<>();
		
		// triverse the element 
		for (Character element :ss) {
			// check if this element n0t there in list then add itt so we have used here if statement.
			if(!newList.contains(element)) {
				newList.add(element);
				
			}
		}
		
		return newList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Character> ss = Arrays.asList(new Character []{'1', '2', '2', '2', '@', '#', 'O', 'o', '0', '3', '1', '?', '*', 'o', 'e'});

System.out.println("character contains duplicate element :"+ss);

List<Character> newList=removeDuplicates(ss);

System.out.println("list of character contains no duplicate :"+newList);
	}

}



//Create a list not having duplicate values from given list
//List<Character> ss = Arrays.asList(new Character[]{'1', '2', '2', '2', '@', '#', 'O', 'o', '0', '3', '1', '?', '*', 'o', 'e'});