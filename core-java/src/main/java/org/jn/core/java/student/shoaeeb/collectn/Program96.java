package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.List;

public class Program96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("green");
		list.add("red");
		list.add("yellow");
		
		System.out.println(list);
		list.set(1, "blue");
		System.out.println("After replacing");
		System.out.println(list);
	}

}
