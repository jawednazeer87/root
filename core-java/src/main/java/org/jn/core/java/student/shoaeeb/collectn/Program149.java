package org.jn.core.java.student.shoaeeb.collectn;

import java.util.TreeSet;

public class Program149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(6);
		ts.add(4);
		ts.add(10);
		ts.add(7);
		
		
		int ele=ts.last();
		ts.remove(ele);
		System.out.println(ts);
	}

}