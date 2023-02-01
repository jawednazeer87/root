package org.jn.core.java.student.shoaeeb.lambda;

public class CircleAreaMain {
	void calculateArea(double radius,CircleArea ref)
	{
		ref.calculate(radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleAreaMain obj = new CircleAreaMain();
		CircleArea ref =(radius)->System.out.println(Math.PI *radius*radius);
		obj.calculateArea(5,ref );
		
	}

}
