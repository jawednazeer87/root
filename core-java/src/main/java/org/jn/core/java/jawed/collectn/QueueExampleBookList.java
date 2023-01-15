package org.jn.core.java.jawed.collectn;

import java.util.PriorityQueue;
import java.util.Queue;

import org.jn.core.java.jawed.clss.model.Book;
import org.jn.core.java.jawed.util.BookUtil;

public class QueueExampleBookList {

	public static void main(String[] args) {
		Queue<Book> queue = new PriorityQueue<>(BookUtil.getList());
		System.out.println(queue);
	}
}
