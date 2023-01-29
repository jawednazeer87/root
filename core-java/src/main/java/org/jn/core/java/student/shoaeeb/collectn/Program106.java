package org.jn.core.java.student.shoaeeb.collectn;

import java.util.LinkedList;

public class Program106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li  = new LinkedList<>();
		li.add("red");
		li.add("green");
		li.add("yellow");
		li.add("black");
		li.add("yellow");
		System.out.println(li);
		
		System.out.println("First Occurence of yellow "+ li.indexOf("yellow")+" Last Occurence of yellow "+li.lastIndexOf("yellow"));
		
	}

}
