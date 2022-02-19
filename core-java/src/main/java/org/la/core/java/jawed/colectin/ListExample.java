package org.la.core.java.jawed.colectin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jawednazeer
 *
 */
public class ListExample {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(1);
		list.add("an");
		list.add('c');
		
		int i = (int)list.get(0);
		String s = (String)list.get(1);
		char c = (char)list.get(2);
		System.out.println("i: "+i);
		System.out.println("s: "+s);
		System.out.println("c: "+c);
	}
}
