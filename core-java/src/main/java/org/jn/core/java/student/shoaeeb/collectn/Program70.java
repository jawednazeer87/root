package org.jn.core.java.student.shoaeeb.collectn;

import java.util.TreeMap;

public class Program70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1,"Red");
		tmap.put(2, "Green");
		tmap.put(3, "Yellow");
		tmap.put(4, "Blue");
		TreeMap<Integer,String> copyMap = new TreeMap<>();
		copyMap.putAll(tmap);
		System.out.println(copyMap);

	}
}
