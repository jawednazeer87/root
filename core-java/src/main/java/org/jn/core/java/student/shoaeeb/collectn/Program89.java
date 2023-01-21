package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("green");
		list.add("yellow");
		list.add("black");
		
		System.out.println("before swap");
		System.out.println(list);
		
		Collections.swap(list, 1, 2);
		System.out.println("After swap");
		System.out.println(list);
	}

}
