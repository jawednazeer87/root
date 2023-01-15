package org.jn.core.java.jawed.collectn;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(6);
		queue.add(8);
		int i = queue.peek();
		System.out.println("i: " + i);
		i = queue.poll();
		System.out.println("i: " + i);
		i = queue.peek();
		System.out.println("i: " + i);
		System.out.println(queue);
	}
}
