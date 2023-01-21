package org.jn.core.java.student.shoaeeb.collectn;

import java.util.TreeMap;

public class Program63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(10, "red");
		tmap.put(20, "green");
		tmap.put(30, "yellow");
		tmap.put(40, "blue");
		tmap.put(50, "black");
		
		System.out.println(tmap.subMap(20, 60));
	}

}
