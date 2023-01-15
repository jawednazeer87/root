package org.jn.core.java.jawed.collectn;

import java.util.ArrayList;
import java.util.List;

public class ListRawType2 {

	public static void main(String[] args) {
		List list = new ArrayList(30);
		list.add(3);
		list.add("hello");
		list.add('@');
		list.add(6.755);
		System.out.println("list2 size: "+list.size()); 
		for (int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		int index = 0;
		for (Object i: list) {
			int iv = (int)i;
			System.out.println(index++ + " : "+i);
		}
	}

	void processList(List list) {
		Object object = list.get(0);
	}
}
