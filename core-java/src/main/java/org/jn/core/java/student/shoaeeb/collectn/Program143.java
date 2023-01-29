package org.jn.core.java.student.shoaeeb.collectn;

import java.util.Iterator;
import java.util.TreeSet;

public class Program143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<>();
		set.add(6);
		set.add(1);
		set.add(5);
		set.add(8);
		set.add(9);
		set.add(2);
		TreeSet<Integer> newSet = new TreeSet<>();
		newSet = (TreeSet)newSet.headSet(7);
		Iterator it = newSet.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
