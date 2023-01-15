package org.jn.core.java.jawed.collectn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.jn.core.java.jawed.clss.model.Book;
import org.jn.core.java.jawed.util.BookUtil;

public class SortListDescComparatorLambdaCustom {

	public static void main(String[] args) {
		List<Book> list = BookUtil.getList();
		Comparator<Book> comparator = (x, y) -> {
				if (x.getPrice()>y.getPrice()) {
					return 1;
				}
				if (x.getPrice()==y.getPrice()) {
					return 0;
				} 
				return -1;
			};
//		Collections.sort(list, comparator);
		Collections.sort(list);
		int index = 0;
		for (Book book: list) {
			System.out.println(index++ + " : "+book);
		}
	}
}

