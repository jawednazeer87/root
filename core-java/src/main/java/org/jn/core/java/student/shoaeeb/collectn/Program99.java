package org.jn.core.java.student.shoaeeb.collectn;

import java.util.Iterator;
import java.util.LinkedList;

public class Program99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li  = new LinkedList<>();
		li.add("red");
		li.add("green");
		li.add("yellow");
		li.add("black");
		
		Iterator itr = li.listIterator(1);
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}