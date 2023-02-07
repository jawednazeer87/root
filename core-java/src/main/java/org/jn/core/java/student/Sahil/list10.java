package org.jn.core.java.student.Sahil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class list10 {
public static void main(String[] args) {
	List<Integer> list= new ArrayList();
	list.add(12);
	list.add(999);
	list.add(65);
	list.add(-223);
	Comparator<Integer> obj  = (x , y) ->-x.compareTo(y);
	Collections.sort(list , obj );
	int index = 0;
	for (int  a : list ) {
		System.out.println(index++ + " : " + a); 
	}

}
}
