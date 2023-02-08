package org.jn.core.java.student.Sahil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set2 {
public static void main(String[] args) {
	Set<Integer> set = new HashSet();
	set.add(98);
	set.add(436);
	set.add(33);
	Iterator<Integer> itr = set.iterator();
	while(itr.hasNext()) {
	Integer i = itr.next();
	System.out.println(i);
	}
	
}
}
