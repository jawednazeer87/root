package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.List;

public class Program79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		System.out.println(list);
		//adding at first position in arraylist
		list.add(0, "Zero");
		
		System.out.println(list);
	}

}
