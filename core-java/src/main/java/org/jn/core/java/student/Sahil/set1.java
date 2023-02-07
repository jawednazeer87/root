package org.jn.core.java.student.Sahil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set1 {
public static void main(String[] args) {
	Set<Double> obj = new HashSet<>();
	obj.add(23.0);
	obj.add(23.4);
	obj.add(22.5);
	Iterator<Double> itr = obj.iterator();
	while(itr.hasNext()) {
		double d = itr.next();
		System.out.println(d);
		
	}
}
}
