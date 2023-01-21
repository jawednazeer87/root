package org.jn.core.java.student.shoaeeb.collectn;

import java.util.TreeMap;

public class Program52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//54. Write a Java program to get a key-value mapping associated 
		//with the greatest key less than or equal to the given key
		
		//lowerKey returns the key that is strictly lesss than the key
		//higherkey returns the least key greater than the key
		
		TreeMap<Integer,String> tmap = new TreeMap<>();
		
		tmap.put(1, "welcome");
		tmap.put(2, "to");
		tmap.put(3, "tree");
		tmap.put(4, "map");
		tmap.put(5,"in");
		tmap.put(6, "java");
		int key=tmap.higherKey(4);
		
		System.out.println(tmap.higherKey(4)+"value: "+tmap.get(key));
		
	}

}
