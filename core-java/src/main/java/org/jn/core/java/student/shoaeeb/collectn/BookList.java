package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	static List getBookList() {
		List<Book> list = new ArrayList<>();
		list.add(new Book("xyx","hindi"));
		list.add(new Book("ioew","english"));
		list.add(new Book("jki","science"));
		list.add(new Book("adg","social science"));
		list.add(new Book("hui","maths"));
		return list;
	}
}
