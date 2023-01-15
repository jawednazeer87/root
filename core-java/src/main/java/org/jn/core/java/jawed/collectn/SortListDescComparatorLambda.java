package org.jn.core.java.jawed.collectn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDescComparatorLambda {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(9);
		list.add(8);
		list.add(-1);
		Comparator<Integer> comparator = (x, y) -> -x.compareTo(y);
		Collections.sort(list, comparator);
		int index = 0;
		for (int i: list) {
			System.out.println(index++ + " : "+i);
		}
	}
}

