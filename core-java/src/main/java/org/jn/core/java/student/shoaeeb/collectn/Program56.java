package org.jn.core.java.student.shoaeeb.collectn;

import java.util.TreeMap;

public class Program56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//56. Write a Java program to get the portion of a map 
		//whose keys are strictly less than a given key
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1, "india");
		tmap.put(20, "Usa");
		tmap.put(15, "morroco");
		tmap.put(30, "Bangladesh");
		tmap.put(50, "china");
		tmap.put(60,"nepal");
		
		System.out.println("portion of the map: "+tmap.headMap(40));
		
	}

}
