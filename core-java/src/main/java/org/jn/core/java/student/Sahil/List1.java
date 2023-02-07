package org.jn.core.java.student.Sahil;

import java.util.ArrayList;
import java.util.List;

public class List1 {

public static void main(String[] args) {
	
	List list = new ArrayList(10);
	list.add(87);
	list.add(981);
	list.add(12);
	//list.add("SAHIL");
	System.out.println(list.size());
	for(int i = 0;i<list.size();i++) {
		int iv = (int) list.get(0);
		System.out.println(i +" ;  "+list.get(0));
	}
	int index = 0;
for( Object s : list) {
		System.out.println(index++ + " : "+ s);
	}
}
	}