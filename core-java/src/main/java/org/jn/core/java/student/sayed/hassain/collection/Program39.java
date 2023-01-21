package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program39 {
	//create a new list not having duplicate values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> list = Arrays.asList(new Character[] {'1','2','2','2','@','#','O','o','0','3','1','?','*','o','e'});
		
		//set
		Set<Character> set = new HashSet<>();
		for(char ele: list)
		{
			set.add(ele);
		}
		
		//new list
		List<Character> newList = new ArrayList<>(set);
		
		System.out.println(newList);
		
		
		
		
		
	}

}
