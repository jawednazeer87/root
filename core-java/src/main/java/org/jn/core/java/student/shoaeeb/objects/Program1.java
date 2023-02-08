package org.jn.core.java.student.shoaeeb.objects;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num n =new Num(5);
		Square s = new Square(5,n);
		Cube c = new Cube(5,s);
		System.out.println(s.getSquare());
		System.out.println(c.getCube());
	}

}
