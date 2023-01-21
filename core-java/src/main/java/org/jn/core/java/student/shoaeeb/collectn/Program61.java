package org.jn.core.java.student.shoaeeb.collectn;

import java.util.TreeMap;

public class Program61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1, "india");
		tmap.put(20, "Usa");
		tmap.put(15, "morroco");
		tmap.put(30, "Bangladesh");
		tmap.put(50, "china");
		tmap.put(60,"nepal");
		
		tmap.remove(60);
		int key=tmap.firstKey();
		System.out.println(tmap.firstKey()+ " "+ tmap.get(key));
	}

}
