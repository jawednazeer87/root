package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program17 {
	//17. Create a set of float 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Float> set = new HashSet<>();
		set.add(1.4f);
		set.add(2.4f);
		set.add(3.5f);
		set.add(66.6f);
		//iterator
		Iterator<Float> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
