package org.jn.core.java.student.sayed.hassain.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

public class Program51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse order view of key
		TreeMap<Integer,String> tmap = new TreeMap<>(Collections.reverseOrder());
		tmap.put(1, "India");
		tmap.put(2, "USA");
		tmap.put(3,"Singapore");
		tmap.put(4, "Mexico");
		
		
		Set<Integer> set = tmap.keySet();
		System.out.println(set);
	}

}
