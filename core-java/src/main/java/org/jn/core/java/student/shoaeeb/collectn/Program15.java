package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Program15 {
	//15.	Create a set of character
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character> set = new HashSet<>();
		set.add('i');
		set.add('u');
		set.add('a');
		set.add('e');
		
		Iterator<Character> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
