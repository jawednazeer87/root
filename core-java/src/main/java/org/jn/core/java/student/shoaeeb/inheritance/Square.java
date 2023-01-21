package org.jn.core.java.student.shoaeeb.inheritance;

public class Square extends Shape {

	Square(int l)
	{
		super(l);
		this.l=l;
	}
	void area() {
		System.out.println("Area of Square is: "+(l*l));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square(5);
		sq.area();
	}

}
