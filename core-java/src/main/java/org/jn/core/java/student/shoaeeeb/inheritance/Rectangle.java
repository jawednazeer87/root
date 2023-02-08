package org.jn.core.java.student.shoaeeeb.inheritance;

public class Rectangle extends Shape {
	double b;
	Rectangle(double b,double l)
	{
		super(l);
		this.b=b;
	}
	void area() {
		System.out.println("Area: "+l*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(5,4);
		r.area();
	}

}
