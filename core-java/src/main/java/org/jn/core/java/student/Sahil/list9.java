package org.jn.core.java.student.Sahil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// ANONYMOUS CLASS
public class list9 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList();
	list.add(12);
	list.add(999);
	list.add(65);
	list.add(-223);
	Collections.sort(list , new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1 > o2 ) {
				return -1;
			}
		if(o1 == o2) {
			return 0;
		}
		return 1;
		}
		
		
		
		
		
	});
	int index = 0;
	for (int  a : list ) {
		System.out.println(index++ + " : " + a);
	}

	
	
}
}
