package org.jn.core.java.student.shoaeeb.collectn;

import java.util.LinkedList;

public class Program101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li  = new LinkedList<>();
		li.add("red");
		li.add("green");
		li.add("yellow");
		li.add("black");
		System.out.println(li);
		
		System.out.println("after adding 1");
		
		li.add(1, "blue");
		System.out.println(li);
	}
	

}
