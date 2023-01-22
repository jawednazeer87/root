package org.jn.core.java.student.mirza.baig.clss.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> list = new ArrayList<String>();

		List<String> stringList = Arrays.asList(new String[]{"123", "12", "35", "54", "66", "77", "55", "221", "33"});
		List<String> stringList1 = Arrays.asList(new String[]{"123", "j", "1", "*", "a", "j", "dd", "a", "a"});
list.addAll(stringList);
list.addAll(stringList1);

System.out.println(list);
	}

}


//Create a new String list and add these two list to newly created string list. 
//List<String> stringList = Arrays.asList(new String[]{"123", "12", "35", "54", "66", "77", "55", "221", "33"});
//List<String> stringList = Arrays.asList(new String[]{"123", "j", "1", "*", "a", "j", "dd", "a", "a"});