package org.la.core.java.student.moshin.assignment9;

public class Shapechild2 extends Shapechild1 {
	public void draw2(){
        System.out.println("Square");
    }
	public static void main(String[] args) {
		Shapechild2 s = new Shapechild2();
		s.draw();
		s.draw1();
		s.draw2();
	}
	
}