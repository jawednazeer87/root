package org.jn.core.java.jawed.collectn;

import java.util.ArrayList;
import java.util.List;

public class ListRawType3 {

	public static void main(String[] args) {
		List list = new ArrayList(30);
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(1);
		System.out.println("size: "+list.size()); 
		for (int i=0; i<list.size(); i++) {
			int iv = (int)list.get(i);
			System.out.println(i + " : " + iv);
		}
	}
}
