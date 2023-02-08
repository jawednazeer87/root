package org.jn.core.java.student.shoaeeeb.inheritance;

public class Square extends Shape{
	
	Square(int l)
	{
		super(l);
	}
	void area() {
		System.out.println("area is: "+l*l);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(5);
		s.area();
	}

}
