package org.jn.core.java.jawed.util;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.jawed.clss.model.Book;

public class BookUtil {
	
	public static List<Book> getList() {
		List<Book> list = new ArrayList<>();
		list.add(new Book(400, "shoib", "physics"));
		list.add(new Book(300, "ameen", "maths"));
		list.add(new Book(4500, "mirza", "history"));
		list.add(new Book(1000, "umer", "cse"));
		list.add(new Book(900, "shizan", "ece"));
		list.add(new Book(450, "sahil", "urdu"));
		list.add(new Book(770, "dawood", "english"));
		list.add(new Book(290, "ahmad", "hindi"));
		list.add(new Book(10, "anas", "bengali"));
		return list;
	}

}
