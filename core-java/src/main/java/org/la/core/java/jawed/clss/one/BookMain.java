/**
 * 
 */
package org.la.core.java.jawed.clss.one;

import org.la.core.java.jawed.clss.Book;

/**
 * @author jawednazeer
 *
 */
public class BookMain {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.numOfPages = 33;
		book.author = "jain";
		book.print();
	}
}
