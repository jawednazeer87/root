package org.la.core.java.student.wang.assignment10.Task02;

public class BookMain {
    public static void main(String[] args) {
        Book book = new ChineseBook();
        book.read();
        book = new EnglishBook();
        book.read();
    }
}
