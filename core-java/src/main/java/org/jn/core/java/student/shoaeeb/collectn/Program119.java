package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li  = new LinkedList<>();
		li.add("red");
		li.add("green");
		li.add("yellow");
		li.add("black");
		System.out.println(li);
		
		ArrayList<String> ar = new ArrayList<>(li);
		
		for(String item: ar)
		{
			System.out.println(item);
		}
		
		
		
	}

}
