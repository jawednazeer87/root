package org.jn.core.java.student.Sahil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set3 {
public static void main(String[] args) {
	Set<Double> set = new HashSet();
	set.add(89.55);
	set.add(64.99);
	set.add(89.55);
	set.add(73.0);
	Iterator<Double> itr=set.iterator();
		// it is maintaining order
	while(itr.hasNext()) {
		Double d = itr.next();
		System.out.println(d);
	}
	// it is not maintaining order
//	for (Double d : set) {
	//	System.out.println(d);
	 //}
	
}
}
