package org.jn.core.java.student.sayed.hassain.collection;

import java.util.TreeMap;

public class Program58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1, "india");
		tmap.put(20, "Usa");
		tmap.put(15, "morroco");
		tmap.put(30, "Bangladesh");
		tmap.put(50, "china");
		tmap.put(60,"nepal");
		
		System.out.println("Strictly greater than 30 :"+tmap.higherKey(30));
	}

}
