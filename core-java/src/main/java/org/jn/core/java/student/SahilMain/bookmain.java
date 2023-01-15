package org.jn.core.java.student.SahilMain;

import org.jn.core.java.student.Sahil.book;

public class bookmain {
public static void main(String[] args) {
book obj= new book();


obj.setName("PHYSICS");
obj.setPrice(900);
System.out.println("BOOK NAME : " + obj.getName());
System.out.println("BOOK PRICE : "+ obj.getPrice());
}
}
