package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li  = new LinkedList<>();
		li.add("red");
		li.add("green");
		li.add("yellow");
		li.add("black");
		System.out.println(li);
		
		LinkedList<String> list  = new LinkedList<>(li);
		LinkedList<String> newList = new LinkedList<>();
 		for(String ele: li)
		{
			newList.add(list.contains(ele)?" yes":"no");
		}
 		
 		System.out.println(newList);

		
	}

}
