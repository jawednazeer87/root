package org.jn.core.java.student.sayed.hassain.collection;

import java.util.TreeMap;

public class Program60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1, "india");
		tmap.put(20, "Usa");
		tmap.put(15, "morroco");
		tmap.put(30, "Bangladesh");
		tmap.put(50, "china");
		tmap.put(60,"nepal");
		
		int key=tmap.lowerKey(50);
		System.out.println(tmap.lowerKey(50)+ " "+ tmap.get(key));
		
	}

}
