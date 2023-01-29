package org.jn.core.java.student.shoaeeb.collectn;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Program153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("green");
		q.add("black");
		q.add("white");
		q.add("red");
		PriorityQueue<String> nq = new PriorityQueue<>();
		nq.addAll(q);
		System.out.println(nq);

	}

}
