package org.jn.core.java.student.sayed.hassain.collection;

import java.util.TreeMap;

public class Program66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1, "Java");
		tmap.put(2, "C");
		tmap.put(3, "pearl");
		tmap.put(4, "c#");
		tmap.put(5, "c++");
		System.out.println("Greater than the key: "+tmap.tailMap(2,false));
	}

}
