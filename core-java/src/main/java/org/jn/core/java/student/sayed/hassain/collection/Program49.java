package org.jn.core.java.student.sayed.hassain.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1, "shoaeeb");
		tmap.put(3, "Shizan");
		tmap.put(2, "Aisha");
		
		Set<Integer> set = tmap.keySet();
		
//		for(int key: set)
//		{
//			System.out.println(key+ ": "+tmap.get(key));
//		}
		//printing tmap;
		System.out.println(tmap);
		//removing all element from key map
		tmap.clear();
		System.out.println(tmap);
	}

}
