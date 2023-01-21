package org.jn.core.java.student.sayed.hassain.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> list = BookList.getBookList();
		Comparator<Book> comparator = (o1,o2) -> {
			return o1.getSubject().compareTo(o2.getSubject());
		};
		//sort the list using subject
		Collections.sort(list,comparator);
		System.out.println(list);
		
		
		//sort the list usig author
		comparator = (o1,o2) -> o1.getAuthor().compareTo(o2.getAuthor());
		
		Collections.sort(list,comparator);
		System.out.println(list);
	}

}
