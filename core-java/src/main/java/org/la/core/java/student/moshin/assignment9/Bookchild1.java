package org.la.core.java.student.moshin.assignment9;

public class Bookchild1 extends Book {
	public void Read1(){
        System.out.println("B Not Reading");
    }
	public static void main(String[] args) {
		Bookchild1 s = new Bookchild1();
		s.Read();
		s.Read1();
	}
	
}