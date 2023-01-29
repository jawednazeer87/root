package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Program136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<>();
		set.add("banana");
		set.add("apple");
		set.add("pears");
		set.add("watermelon");
		
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
