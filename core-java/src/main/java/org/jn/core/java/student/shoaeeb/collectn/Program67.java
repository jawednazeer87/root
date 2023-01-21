package org.jn.core.java.student.shoaeeb.collectn;

import java.util.TreeMap;

public class Program67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1, "Java");
		tmap.put(2, "C");
		tmap.put(3, "pearl");
		tmap.put(4, "c#");
		tmap.put(5, "c++");
		int key=tmap.higherKey(4);
		System.out.println(tmap.higherKey(4)+" "+tmap.get(key));
	}

}
