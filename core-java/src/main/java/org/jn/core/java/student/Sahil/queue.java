package org.jn.core.java.student.Sahil;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
public static void main(String[] args) {
	Queue<Integer> queue = new LinkedList();
	queue.add(12);
	queue.add(1);
	queue.add(35);
	queue.poll();
	int i = queue.poll();
	System.out.println(i);
	queue.peek();
	i = queue.peek();
	System.out.println(i);
	}
}
