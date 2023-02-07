package org.jn.core.java.student.Sahil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class list7 {
public static void main(String[] args) {
List<Integer> list = new ArrayList();
	
	list.add(88);
	list.add(00);
	list.add(299);
	list.add(54);
	list.add(10);
	
	CustomComparator obj = new CustomComparator();

	Collections.sort(list , obj );
	int index = 0;
	for (int s : list) {
	System.out.println(index++ +" : "+ s );
	}

		
	}		

}
class CustomComparator implements Comparator<Integer>{
	@Override
	public int compare (Integer i1 , Integer i2) {
		if(i1 > i2 ) {
			return -1; 
		}
		if (i1 == i2) {
			return 0;
		}
		return 1;
		
		
	}
	}