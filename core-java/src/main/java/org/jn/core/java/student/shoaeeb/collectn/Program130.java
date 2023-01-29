package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("banana");
		set.add("apple");
		set.add("pears");
		set.add("watermelon");
		
		System.out.println(set);
		
		List<String> list  = new ArrayList<>();
		list.addAll(set);
		System.out.println(list);
	
	}

}
