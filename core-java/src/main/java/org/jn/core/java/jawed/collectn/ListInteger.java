package org.jn.core.java.jawed.collectn;

import java.util.ArrayList;
import java.util.List;

public class ListInteger {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(1);
		for (int i=0; i<list.size(); i++) {
			int iv = list.get(i);
			System.out.println(i + " : " + iv);
		}
		int index = 0;
		for (int i: list) {
			System.out.println(index++ + " : "+i);
		}
	}

}
