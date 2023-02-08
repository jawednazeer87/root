package org.jn.core.java.student.shoaeeb.collection.framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}

}
