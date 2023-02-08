package org.jn.core.java.student.shoaeeb.collection.framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.add("India");
		hs.add("Bangladesh");
		hs.add("China");
		hs.add("USA");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	} 

}
