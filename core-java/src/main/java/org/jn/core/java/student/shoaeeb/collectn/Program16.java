package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Program16 {
	//16. Create a set of boolean
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Boolean> set = new HashSet<>();
		set.add(false);
		set.add(true);
		Iterator<Boolean> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
