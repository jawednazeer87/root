package org.jn.core.java.student.Sahil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class list8 {
public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<>();
	list.add(12);
	list.add(999);
	list.add(65);
	list.add(223);
	ComaparatorClass obj = new ComaparatorClass();
	Collections.sort(list , obj);
	int index = 0;
	for (int  a : list ) {
		System.out.println(index++ + " : " + a);
	}
	
}
}
class ComaparatorClass implements Comparator<Integer> {
	
		@Override
	public int compare(Integer i1, Integer i2) {
			if(i1 > i2 ) {
				return -1; 
			}
			if (i1 == i2) {
				return 0;
			}
			return 1; 
			
			
	}
}	
	

