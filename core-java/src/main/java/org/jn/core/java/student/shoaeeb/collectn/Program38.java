package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program38 {
	//create a list not having duplicate values
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(new String[] {"abc","xyz","abcd","abc","hello","world","bike","ant","world"});
		//creating a hash set
		Set<String> set = new HashSet<>();
		
		for(String ele: list)
		{
			set.add(ele);
		}
		
		List<String> newList = new ArrayList<>(set);
		
		//printing the newList
		System.out.println(newList);
		
	}

}
