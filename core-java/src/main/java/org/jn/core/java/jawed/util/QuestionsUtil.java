package org.jn.core.java.jawed.util;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class QuestionsUtil {

	public static int[] removeDuplicates(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i: arr) {
			set.add(i);
		}
		int[] res = new int[set.size()];
		int ind = 0;
		for (int i: set) {
			res[ind++] = i;
		}
		return res;
	}
	
	public static int[] removeDuplicatesOrder(int[] arr) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i: arr) {
			set.add(i);
		}
		int[] res = new int[set.size()];
		int ind = 0;
		for (int i: set) {
			res[ind++] = i;
		}
		return res;
	}
}
