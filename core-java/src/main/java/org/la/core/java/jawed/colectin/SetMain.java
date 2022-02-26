package org.la.core.java.jawed.colectin;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jawednazeer
 *
 */
public class SetMain {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		for(String s : set) {
			System.out.println("val: "+s);
		}
	}
}
