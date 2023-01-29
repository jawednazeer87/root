package org.jn.core.java.student.shoaeeb.collectn;

import java.util.LinkedList;

public class Program113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li  = new LinkedList<>();
		li.add("red");
		li.add("green");
		li.add("yellow");
		li.add("black");
		System.out.println(li);
		
		LinkedList<String> list = new LinkedList<>();
		list.add("white");
		list.add("blue");
		list.add("purple");
		
		li.addAll(list);
		
		System.out.println(li);
	}

}
