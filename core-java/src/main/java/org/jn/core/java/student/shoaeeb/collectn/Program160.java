package org.jn.core.java.student.shoaeeb.collectn;

import java.util.PriorityQueue;

public class Program160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("green");
		q.add("white");
		q.add("black");
		System.out.println(q);
		String arr[]  = new String[q.size()];
		q.toArray(arr);
		for(String ele: arr)
		{
			System.out.println(ele);
		}
	}

}
