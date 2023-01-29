package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashSet;
import java.util.Set;

public class Program133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("green");
		set.add("yellow");
		set.add("black");
		set.add("white");
		set.add("blue");
		
		
		Set<String> colors=  new HashSet<>();
		colors.add("yellow");
		colors.add("purple");
		colors.add("green");
		colors.add("violet");
		colors.add("black");
		
		Set<String> newSet = new HashSet<>();
		
		for(String ele: set)
		{
			newSet.add(colors.contains(ele)? ele:" ");
		}
		
		System.out.println(newSet);
		
		
		
	}

}
