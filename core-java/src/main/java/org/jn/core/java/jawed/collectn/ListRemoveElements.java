package org.jn.core.java.jawed.collectn;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.jn.core.java.jawed.clss.model.Book;
import org.jn.core.java.jawed.util.BookUtil;

public class ListRemoveElements {

	public static void main(String[] args) {
		List<Book> list = BookUtil.getList();
		Iterator<Book> itr = list.iterator();
		while (itr.hasNext()) {
			Book book = itr.next();
			if (book.getSubject().equals("ece")) {
				itr.remove();
			}
		}
		// below code will give concurrent modification exception
//		for (Book book: list) {
//			if (book.getSubject().equals("ece")) {
//				list.remove(book);
//			}
//		}
		System.out.println(list);
	}
}
