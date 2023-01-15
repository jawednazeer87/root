package org.jn.core.java.jawed.collectn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDescComparatorLambdaString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("shoib");
		list.add("ameen");
		list.add("mirza");
		list.add("umer");
		list.add("shizan");
		list.add("sahil");
		list.add("dawood");
//		Comparator<Integer> comparator = (x, y) -> -x.compareTo(y);
		Collections.sort(list);
		int index = 0;
		for (String i: list) {
			System.out.println(index++ + " : "+i);
		}
	}
}

