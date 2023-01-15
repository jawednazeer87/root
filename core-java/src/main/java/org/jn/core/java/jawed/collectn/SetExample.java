package org.jn.core.java.jawed.collectn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Double> set = new HashSet<>();
		set.add(3.4);
		set.add(41.4);
		set.add(90.76);
		set.add(1.5);
		set.add(90.76);
		Iterator<Double> itr = set.iterator();
		while (itr.hasNext()) {
			double d = itr.next();
			System.out.println(d);
		}
//		for (double d: set) {
//			System.out.println(d);
//		}
	}
}
