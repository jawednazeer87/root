package org.jn.core.java.student.shoaeeb.collectn;

import java.util.TreeSet;

public class Program142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
		set.add("banana");
		set.add("apple");
		set.add("pears");
		set.add("watermelon");
		TreeSet<String> newSet = new TreeSet<>(set);
		
		System.out.println(set.containsAll(newSet));
		

	}

}
