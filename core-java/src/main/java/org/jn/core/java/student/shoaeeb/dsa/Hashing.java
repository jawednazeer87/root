package org.jn.core.java.student.shoaeeb.dsa;

import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		//add element in the set;
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(3);
		
		//contains
		
		if(set.contains(1))
		{
			System.out.println("1 is in the set");
		}
		else {
			System.out.println(" 1 is not in the set");
		}
		
		System.out.println("size of th set is:"+set.size());//returns the size of the set;
		
		//remove an element
		set.remove(1);
		//printing the set
		System.out.println(set);
		
		
		//iterator
		//it iterates the set
		Iterator it = set.iterator();
		//set.iterator() will return an iterator 
		//for the set
		//function hasNext() and next()
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
