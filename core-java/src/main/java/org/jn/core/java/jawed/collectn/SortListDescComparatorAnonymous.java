package org.jn.core.java.jawed.collectn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDescComparatorAnonymous {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(9);
		list.add(8);
		list.add(-1);
		Collections.sort(list, new Comparator<Integer>() {
				@Override
				public int compare(Integer i1, Integer i2) {
					if (i1 > i2) {
						return -1;
					}
					if (i1 == i2) {
						return 0;
					}
					return 1;
				}
			}
		);
		int index = 0;
		for (int i: list) {
			System.out.println(index++ + " : "+i);
		}
	}
}

