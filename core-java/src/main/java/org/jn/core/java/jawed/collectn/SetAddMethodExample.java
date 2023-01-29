package org.jn.core.java.jawed.collectn;

import java.util.HashSet;
import java.util.Set;

public class SetAddMethodExample {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		boolean res = set.add(1);
		System.out.println("res: " + res);
		res = set.add(1);
		System.out.println("res: " + res);
		set.add(1);
		set.add(1);
		System.out.println("set: " + set);
		System.out.println("size: " + set.size());
	}
}
