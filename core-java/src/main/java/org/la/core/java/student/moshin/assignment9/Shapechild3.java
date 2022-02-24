package org.la.core.java.student.moshin.assignment9;

public class Shapechild3 extends Shapechild2 {
	public void draw3(){
        System.out.println("Rectangle");
    }
	public static void main(String[] args) {
		Shapechild3 s = new Shapechild3();
		s.draw();
		s.draw1();
		s.draw2();
		s.draw3();
	}
	
}