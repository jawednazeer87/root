package org.la.core.java.student.moshin.assignment9;

public class Shapechild1 extends Shape {
	public void draw1(){
        System.out.println("Triangle");
    }
	public static void main(String[] args) {
		Shapechild1 s = new Shapechild1();
		s.draw();
		s.draw1();
	}
	
}