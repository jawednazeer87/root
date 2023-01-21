package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program8 {
//8.	Create a new String list and add these two list to newly created string list. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = Arrays.asList(new String[]{"123", "12", "35", "54", "66", "77", "55", "221", "33"});
		List<String> stringList1 = Arrays.asList(new String[]{"123", "j", "1", "*", "a", "j", "dd", "a", "a"});
		List<String> newStringList  = new ArrayList<>();
		
		for(String ele: stringList)
		{
			newStringList.add(ele);
		}
		
		for(String ele: stringList1)
		{
			newStringList.add(ele);
		}
		
		//printing the list
		for(String ele: newStringList)
		{
			System.out.println(ele);
		}
	}

}
