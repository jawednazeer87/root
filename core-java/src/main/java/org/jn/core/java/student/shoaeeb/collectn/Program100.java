package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Program100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("red");
		list.add("green");
		list.add("blue");
		
		Iterator it = list.descendingIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
