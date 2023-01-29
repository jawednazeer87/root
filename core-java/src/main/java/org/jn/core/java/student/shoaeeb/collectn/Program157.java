package org.jn.core.java.student.shoaeeb.collectn;

import java.util.PriorityQueue;

public class Program157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("green");
		q.add("white");
		PriorityQueue<String> nq = new PriorityQueue<>(q);

		System.out.println(q.containsAll(nq));
	}

}
