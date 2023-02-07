package org.jn.core.java.student.Sahil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List4 {
public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<>();
	list.add(98);
	list.add(67);
	list.add(100);
	int index = 0;
	for(int i = 0 ; i<list.size();i++) {
		
		System.out.println(index++ + " : " + list.get(i));
	}
	int Index=0;
	for(int s : list) {
		
		System.out.println(Index++ + "  :  "+ s);
	}
}
}
