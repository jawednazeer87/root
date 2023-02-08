package org.jn.core.java.student.shoaeeb.abstrct.classes;

public class MyClass1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 ref;
		Square s =new Square();
		ref=s;
		ref.calculate(7);
		SquareRoot sq = new SquareRoot();
		ref=sq;
		ref.calculate(4);
		Cube c= new Cube();
		ref=c;
		c.calculate(4);
	}

}
