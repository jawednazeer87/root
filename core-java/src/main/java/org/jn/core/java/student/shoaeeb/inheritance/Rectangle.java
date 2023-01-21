package org.jn.core.java.student.shoaeeb.inheritance;

public class Rectangle extends Shape{
	
	int b;
	Rectangle(int a,int b)
	{
		super(a);
		this.b=b;
	}
	void area() {
		System.out.println("Area of Rectangle: "+(l*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(5,6);
		r.area();

	}

}
