package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("i'm");
		set.add("shoeeb");
		set.add("osman");
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
