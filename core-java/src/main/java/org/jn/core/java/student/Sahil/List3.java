package org.jn.core.java.student.Sahil;

import java.util.ArrayList;
import java.util.List;

public class List3 {
public static void main(String[] args) {
	//list INTEGER
	List<Integer> list = new ArrayList<>(10);
	list.add(87);
	list.add(33);
	list.add(981);
	list.add(12);
	//list.add("SAHIL");
	System.out.println(list.size());
	for(int i = 0;i<list.size();i++) {
		int iv =  list.get(0);
		System.out.println(i +" ;  "+list.get(0));
	}
	

}
}
