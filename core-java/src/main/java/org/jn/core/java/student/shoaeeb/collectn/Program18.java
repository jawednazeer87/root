package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program18 {
	//18. Create a set of int
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> integerList = new HashSet<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		
		//iterator
		Iterator<Integer> itr = integerList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
