package org.jn.core.java.jawed.collectn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(1);
		Collections.sort(list);
		int index = 0;
		for (int i: list) {
			System.out.println(index++ + " : "+i);
		}
	}

}
