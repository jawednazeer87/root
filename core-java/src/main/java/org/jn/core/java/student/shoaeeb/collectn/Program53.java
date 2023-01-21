package org.jn.core.java.student.shoaeeb.collectn;

import java.util.TreeMap;

public class Program53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//55. Write a Java program to get the greatest key less than or 
		//equal to the given key
		TreeMap<Integer,String> tmap = new TreeMap<>();
		
		tmap.put(1, "welcome");
		tmap.put(2, "to");
		tmap.put(3, "tree");
		tmap.put(4, "map");
		tmap.put(5,"in");
		tmap.put(6, "java");
		
		System.out.println(tmap.lowerKey(4));
		
	}

}
