package org.jn.core.java.student.Sahil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list5 {
public static void main(String[] args) {
    
		//SortList
	
	List<Integer> list = new ArrayList();
	
	list.add(88);
	list.add(00);
	list.add(299);
	list.add(54);
	list.add(10);
	Collections.sort(list);

	int index = 0;
	for (int i =0 ;i<list.size();i++) {
		System.out.println(index++ + " : " + list.get(i));
		
	}
	
	//for (int s : list) {
		// System.out.println(index++ +" : "+ s);
	//}	

}
	
	
}
