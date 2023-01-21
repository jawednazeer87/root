package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class Program91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("green");
		list.add("blue");
		list.add("black");
		System.out.println(list);
		List<String> newList = new ArrayList<>(list);
		System.out.println(newList);
	}

}
