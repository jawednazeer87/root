package org.jn.core.java.student.sayed.hassain.collection;

import java.util.TreeMap;

public class Program50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1,"India");
		tmap.put(2, "USA");
		tmap.put(3, "Malaysia");
		tmap.put(4, "Singapore");
		
		System.out.println("lowest key: "+tmap.firstKey());
		System.out.println("highest key: "+tmap.lastKey());
	}

}
