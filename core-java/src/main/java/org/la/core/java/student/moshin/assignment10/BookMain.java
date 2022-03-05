package org.la.core.java.student.moshin.assignment10;

public class BookMain {
    public static void main(String[] args) {
        Book book = new HindiBook();
        book.read();
        book = new EnglishBook();
        book.read();
    }
}
