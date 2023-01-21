package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	static List getBookList() {
		List<Book> list = new ArrayList<>();
		list.add(new Book("abcd","hindi"));
		list.add(new Book("efgh","english"));
		list.add(new Book("ijkl","science"));
		list.add(new Book("mnop","social science"));
		list.add(new Book("qrst","maths"));
		return list;
	}
}
