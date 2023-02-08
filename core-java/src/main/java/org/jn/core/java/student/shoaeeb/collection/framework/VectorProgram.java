package org.jn.core.java.student.shoaeeb.collection.framework;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		//System.out.println(v.get(2));
		
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		ListIterator<Integer> it = v.listIterator();
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

}
