package org.jn.core.java.student.sayed.hassain.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> tmap = new TreeMap<>();
		//putting values in map
		
		tmap.put(1, "shoaeeb");
		tmap.put(2, "suraiya");
		tmap.put(3, "sumaiya");
		tmap.put(4, "gian");
		
		//get all the keys
		Set<Integer> set = tmap.keySet();
		
		System.out.println(set);
	}

}
