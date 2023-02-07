package org.jn.core.java.student.Sahil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list6 {
public static void main(String[] args) {
	//Comparator collections
List<Integer> list = new ArrayList();
	
	list.add(88);
	list.add(00);
	list.add(299);
	list.add(54);
	list.add(10);
	Collections.sort(list);

	int index = 0;
	for (int s : list) {
	System.out.println(index++ +" : "+ s);
	}
	
	
}
}
