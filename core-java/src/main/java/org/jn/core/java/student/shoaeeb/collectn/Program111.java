package org.jn.core.java.student.shoaeeb.collectn;

import java.util.LinkedList;

public class Program111 {

	static void swap(LinkedList<String> li,String ele,String ele1)
	{
		int index1=li.indexOf(ele);
		int index2=li.indexOf(ele1);
		
		li.set(index2, ele);
		li.set(index1, ele1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li  = new LinkedList<>();
		li.add("red");
		li.add("green");
		li.add("yellow");
		li.add("black");
		System.out.println(li);
		
		System.out.println("swap two elements");
		swap(li,"green","yellow");
		System.out.println(li);
		
		
	}

}
