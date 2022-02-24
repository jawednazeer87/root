package org.la.core.java.student.moshin.assignment9;

public class Bookchild2 extends Bookchild1 {
	public void Read2(){
        System.out.println("C Not Reading");
    }
	public static void main(String[] args) {
		Bookchild2 s = new Bookchild2();
		s.Read();
		s.Read1();
		s.Read2();
	}
	
}